package com.jetsen.enroll.controller;

import com.jetsen.enroll.dao.domain.Class;
import com.jetsen.enroll.dao.domain.Event;
import com.jetsen.enroll.dao.domain.Member;
import com.jetsen.enroll.service.ClassService;
import com.jetsen.enroll.service.EventService;
import com.jetsen.enroll.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 14:08
 */
@Controller
@RequestMapping("/enroll")
public class EnrollController {
    @Autowired
    private EventService eventService;

    @Autowired
    private ClassService classService;

    @Autowired
    private MemberService memberService;

    ReentrantLock lock = new ReentrantLock();

    @GetMapping("/getEvent")
    @ResponseBody
    public Event getEvent() {
        return eventService.selectByPrimaryKey(1);
    }

    @GetMapping("/getClasses")
    public String getClasses(ModelMap modelMap) {
        int canDraw = 0; //是否可以抽签
        List<Class> classes = classService.getClasses();

//        LocalDateTime startTime = LocalDateTime.parse("2020-08-21T12:00:00");
//        LocalDateTime now = LocalDateTime.now();
//        if (now.isBefore(startTime)) {
//            canDraw = 2;
//        }

        for (Class c : classes) {
            //如果未确定队长，不允许抽签
            if (StringUtils.isEmpty(c.getLeader())) {
                canDraw = 1;
                break;
            }
        }

        modelMap.put("classes", classService.getClasses());
        modelMap.put("canDraw", canDraw);
        return "enroll/class";
    }

    @PostMapping("/getGroups")
    @ResponseBody
    public List<Class> getGroups() {
        return classService.getClasses();
    }

    //抽签
    @PostMapping("/draw/{name}")
    @ResponseBody
    public int draw(@PathVariable("name") String name) {
        //同一微信名不会出现并发情况，所以些段代码不用加锁
        Member member = memberService.selectByPrimaryKey(name);
        if (member != null) {
            //已抽过签
            return 1;
        }

        lock.lock();
        try {
            List<Class> classes = classService.getClasses();
            for (Class c : classes) {
                if (c.getLeader().equals(name)) {
                    return 2; //队长无须抽签
                }
            }

            //未满员的组，每组一队长，三个成员
            List<Class> cs = classes.stream()
                    .filter(c -> c.getMembers().size() < 3).collect(Collectors.toList());

            if (cs == null || cs.size() == 0) {
                return 3; //名额已满
            }
            //随机取一个
            Class c = cs.get(new Random().nextInt(cs.size()));


            member = new Member();
            member.setClassId(c.getClassId());
            member.setMemberName(name);
            memberService.insert(member);
        } finally {
            lock.unlock();
        }
        return 0;
    }
}

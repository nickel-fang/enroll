package com.jetsen.index;

import com.jetsen.enroll.dao.domain.Class;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author: Nickel Fang
 * @date: 2020/8/25 16:54
 */
@Controller
public class Index {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}

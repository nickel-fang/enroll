package com.jetsen.enroll.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.jetsen.enroll.dao.mapper.EventMapper;
import com.jetsen.enroll.dao.domain.Event;
import com.jetsen.enroll.service.EventService;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 13:53
 */
@Service
public class EventServiceImpl implements EventService {

    @Resource
    private EventMapper eventMapper;

    @Override
    public int deleteByPrimaryKey(Integer eventid) {
        return eventMapper.deleteByPrimaryKey(eventid);
    }

    @Override
    public int insert(Event record) {
        return eventMapper.insert(record);
    }

    @Override
    public int insertSelective(Event record) {
        return eventMapper.insertSelective(record);
    }

    @Override
    public Event selectByPrimaryKey(Integer eventid) {
        return eventMapper.selectByPrimaryKey(eventid);
    }

    @Override
    public int updateByPrimaryKeySelective(Event record) {
        return eventMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Event record) {
        return eventMapper.updateByPrimaryKey(record);
    }

}


package com.jetsen.enroll.service;

import com.jetsen.enroll.dao.domain.Event;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 13:53
 */
public interface EventService {


    int deleteByPrimaryKey(Integer eventid);

    int insert(Event record);

    int insertSelective(Event record);

    Event selectByPrimaryKey(Integer eventid);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);

}


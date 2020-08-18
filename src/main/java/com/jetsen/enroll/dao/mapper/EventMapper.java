package com.jetsen.enroll.dao.mapper;

import com.jetsen.enroll.dao.domain.Event;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 14:44
 */
public interface EventMapper {
    int deleteByPrimaryKey(Integer eventId);

    int insert(Event record);

    int insertSelective(Event record);

    Event selectByPrimaryKey(Integer eventId);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);
}
package com.jetsen.enroll.service;

import com.jetsen.enroll.dao.domain.Class;

import java.util.List;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 13:53
 */
public interface ClassService {


    int deleteByPrimaryKey(Integer groupid);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer groupid);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);

    List<Class> getClasses();

}


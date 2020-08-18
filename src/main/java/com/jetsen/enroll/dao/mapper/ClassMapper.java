package com.jetsen.enroll.dao.mapper;

import com.jetsen.enroll.dao.domain.Class;

import java.util.List;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 14:44
 */
public interface ClassMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer classId);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);

    List<Class> getClasses();
}
package com.jetsen.enroll.dao.mapper;

import com.jetsen.enroll.dao.domain.Member;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 14:44
 */
public interface MemberMapper {
    int deleteByPrimaryKey(String memberName);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(String memberName);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}
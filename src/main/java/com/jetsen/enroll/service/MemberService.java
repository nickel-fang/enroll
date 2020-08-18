package com.jetsen.enroll.service;

import com.jetsen.enroll.dao.domain.Member;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 13:53
 */
public interface MemberService {


    int deleteByPrimaryKey(String membername);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(String membername);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}


package com.jetsen.enroll.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.jetsen.enroll.dao.mapper.MemberMapper;
import com.jetsen.enroll.dao.domain.Member;
import com.jetsen.enroll.service.MemberService;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 13:53
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;

    @Override
    public int deleteByPrimaryKey(String membername) {
        return memberMapper.deleteByPrimaryKey(membername);
    }

    @Override
    public int insert(Member record) {
        return memberMapper.insert(record);
    }

    @Override
    public int insertSelective(Member record) {
        return memberMapper.insertSelective(record);
    }

    @Override
    public Member selectByPrimaryKey(String membername) {
        return memberMapper.selectByPrimaryKey(membername);
    }

    @Override
    public int updateByPrimaryKeySelective(Member record) {
        return memberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Member record) {
        return memberMapper.updateByPrimaryKey(record);
    }

}


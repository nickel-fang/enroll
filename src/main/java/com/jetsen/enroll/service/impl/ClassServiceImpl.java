package com.jetsen.enroll.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.jetsen.enroll.dao.domain.Class;
import com.jetsen.enroll.dao.mapper.ClassMapper;
import com.jetsen.enroll.service.ClassService;

import java.util.List;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 13:53
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Resource
    private ClassMapper classMapper;

    @Override
    public int deleteByPrimaryKey(Integer groupid) {
        return classMapper.deleteByPrimaryKey(groupid);
    }

    @Override
    public int insert(Class record) {
        return classMapper.insert(record);
    }

    @Override
    public int insertSelective(Class record) {
        return classMapper.insertSelective(record);
    }

    @Override
    public Class selectByPrimaryKey(Integer groupid) {
        return classMapper.selectByPrimaryKey(groupid);
    }

    @Override
    public int updateByPrimaryKeySelective(Class record) {
        return classMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Class record) {
        return classMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Class> getClasses() {
        return classMapper.getClasses();
    }

}


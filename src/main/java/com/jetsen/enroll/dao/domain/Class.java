package com.jetsen.enroll.dao.domain;

import java.util.List;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 14:44
 */
public class Class {
    private Integer classId;

    private String className;

    private String leader;

    private List<Member> members;

    public Integer getClassId() {
        return classId;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}
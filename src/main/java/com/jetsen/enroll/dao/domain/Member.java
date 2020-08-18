package com.jetsen.enroll.dao.domain;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 14:44
 */
public class Member {
    private String memberName;

    private Integer classId;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
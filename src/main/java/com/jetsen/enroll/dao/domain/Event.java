package com.jetsen.enroll.dao.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 14:44
 */
public class Event {
    private Integer eventId;

    /**
     * 活动名称
     */
    private String eventName;

    /**
     * 活动日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date eventDate;

    /**
     * 活动报名、抽签截止时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date deadline;

    /**
     * 活动人数
     */
    private Integer numbers;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }
}

create table EVENT
(
    EVENT_ID   int auto_increment,
    EVENT_NAME varchar(32) comment '活动名称',
    EVENT_DATE date comment '活动日期',
    DEADLINE  timestamp comment '活动报名、抽签截止时间',
    NUMBERS   int comment '活动人数',
    primary key (EVENT_ID)
);

create table CLASS
(
    CLASS_ID   int,
    CLASS_NAME varchar(32),
    LEADER    varchar(32),
    primary key (CLASS_ID)
);


create table MEMBER
(
    MEMBER_NAME varchar(32),
    CLASS_ID    int,
    primary key (MEMBER_NAME)
);
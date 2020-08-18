package com.jetsen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Nickel Fang
 * @date: 2020/8/17 10:15
 */
@SpringBootApplication
@MapperScan("com.jetsen.**.mapper")
public class EnrollApplication {
    public static void main(String[] args) {
        SpringApplication.run(EnrollApplication.class, args);
    }

}

package com.vic.mybatisplus01.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }
}
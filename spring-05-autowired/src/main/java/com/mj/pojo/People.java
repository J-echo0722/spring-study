package com.mj.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

@Data
public class People {
    private String name;
    @Autowired
    private Cat cat;
    @Resource
    private Dog dog;
}

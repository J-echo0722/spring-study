package com.mj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author : MaJ
 * @date : 2021/12/1
 * @description ：
 */
@Component
@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
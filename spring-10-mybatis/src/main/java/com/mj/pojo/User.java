package com.mj.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author : MaJ
 * @date : 2021/11/30
 */
@Component
@Data
public class User {
    private int id;
    private String name;
    private String pwd;
}

package com.mj.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author : MaJ
 * @date : 2021/11/25
 * @description ：
 */
@Getter
@Setter
public class Hello {

    private String str;

    @Override
    public String toString(){
        return "Hello{" + "str='" + str + "\'" + '}';
    }
}

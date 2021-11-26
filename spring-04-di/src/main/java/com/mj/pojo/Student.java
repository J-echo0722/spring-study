package com.mj.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author : MaJ
 * @date : 2021/11/26
 */
@Getter
@Setter
@ToString
public class Student {
    private String name;
    private String email;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String, String> card;
    private Set<String> games;
    private Properties info;
}

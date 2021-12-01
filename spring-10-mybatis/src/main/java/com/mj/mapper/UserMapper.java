package com.mj.mapper;

import com.mj.pojo.User;

import java.util.List;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：mapper 接口
 */
public interface UserMapper {
    List<User> selectUsers();
}

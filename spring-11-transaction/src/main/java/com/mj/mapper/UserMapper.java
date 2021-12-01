package com.mj.mapper;

import com.mj.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：mapper 接口
 */
public interface UserMapper {
    List<User> selectUsers();

    void insert(@Param("user") User user);

    void delete(@Param("id") int id);

    void update(@Param("user") User user);
}

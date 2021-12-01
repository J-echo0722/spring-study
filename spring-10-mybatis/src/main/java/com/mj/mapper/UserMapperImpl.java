package com.mj.mapper;

import com.mj.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：spring 整合 mybatis 方式一 ：利用 SqlSessionTemplate 来生成 SqlSession
 * (因为SqlSessionTemplate 实现了接口 SqlSession)
 */
public class UserMapperImpl implements UserMapper {
    /** 之前的操作都是用 SqlSession 来执行，现在可以用 SqlSessionTemplate*/
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUsers();
    }
}

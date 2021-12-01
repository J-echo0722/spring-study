package com.mj.mapper;

import com.mj.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author : MaJ
 * @date : 2021/12/1
 * @description ：spring 整合 mybatis 方式二：继承 SqlSessionDaoSupport
 * (因为 SqlSessionDaoSupport 中引入了 SqlSessionTemplate)
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUsers() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUsers();
        // return getSqlSession().getMapper(UserMapper.class).selectUsers();
    }
}


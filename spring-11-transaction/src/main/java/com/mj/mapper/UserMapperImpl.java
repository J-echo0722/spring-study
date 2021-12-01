package com.mj.mapper;

import com.mj.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : MaJ
 * @date : 2021/12/1
 * @description ：spring 整合 mybatis 方式二：继承 SqlSessionDaoSupport
 * (因为 SqlSessionDaoSupport 中引入了 SqlSessionTemplate)
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUsers() {
        // 此例子不加事务管理，插入会成功，专门让删除语句有问题，删除会失败，
        User user = new User(5, "小王","2131231");
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.insert(user);
        mapper.delete(4);

        return mapper.selectUsers();
    }

    public void insert(User user) {
        getSqlSession().getMapper(UserMapper.class).insert(user);
    }

    public void delete(int id) {
        getSqlSession().getMapper(UserMapper.class).delete(id);
    }

    public void update(User user) {
        getSqlSession().getMapper(UserMapper.class).update(user);
    }
}


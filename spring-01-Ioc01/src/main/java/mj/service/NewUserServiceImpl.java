package mj.service;


import mj.dao.UserDao;

/**
 * @author : MaJ
 * @date : 2021/11/25
 * @description ：注入实现控制反转
 */
public class NewUserServiceImpl implements UserService {

    private UserDao userDao;

    /** 利用 set 方法动态注入值 */
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}

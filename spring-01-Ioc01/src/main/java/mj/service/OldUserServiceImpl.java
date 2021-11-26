package mj.service;

import mj.dao.UserDao;
import mj.dao.UserDaoImpl;

/**
 * @author : MaJ
 * @date : 2021/11/23
 * @description ：业务层
 */
public class OldUserServiceImpl implements UserService {
    /** 以下 userDao 均为程序控制对象，只要 UserDao 服务有新实现，就得手动修改 */
    private UserDao userDao = new UserDaoImpl();
    // private UserDao userDao = new UserDaoMysqlImpl();
    // private UserDao userDao = new UserDaoOracleImpl();

    public void getUser() {
        userDao.getUser();
    }


}

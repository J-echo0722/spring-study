import mj.dao.UserDaoOracleImpl;
import mj.service.NewUserServiceImpl;
import mj.service.OldUserServiceImpl;
import mj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : MaJ
 * @date : 2021/11/23
 * @description ：实现ioc前 和 实现后
 */
public class MyTest {
    @Test
    void test() {
        // 用户实际调用的是业务层，不接触 dao 层
        // Service 实现需要根据客户想要的，去手动改变 Service 层的 Dao 对象
        UserService userService = new OldUserServiceImpl();
        userService.getUser();

        System.out.println("----------------------------------------------");

        // 客户自己选择需要的业务层，不改变 Service 层的 Dao 对象
        UserService userService1 = new NewUserServiceImpl();
        ((NewUserServiceImpl) userService1).setUserDao(new UserDaoOracleImpl());
        userService1.getUser();
    }

    @Test
    void testWithBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        NewUserServiceImpl userServiceImpl = (NewUserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }

}

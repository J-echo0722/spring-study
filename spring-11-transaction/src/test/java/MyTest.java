import com.mj.mapper.UserMapper;
import com.mj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author : MaJ
 * @date : 2021/12/1
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.selectUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}

import com.mj.mapper.UserMapper;
import com.mj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：
 */
public class MyTest {
    @Test
    public void test() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        // UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        List<User> users = userMapper.selectUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}

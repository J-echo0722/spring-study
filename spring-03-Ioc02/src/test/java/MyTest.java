import com.mj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : MaJ
 * @date : 2021/11/26
 * @description ：
 */
public class MyTest {
    @Test
    void testA() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

        // User user = (User) context.getBean("user");
        // user.show();

        User user1 = (User) context.getBean("user1");
        user1.show();

        User user2 = (User) context.getBean("user2");
        user2.show();
    }
}

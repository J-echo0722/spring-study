import com.mj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : MaJ
 * @date : 2021/11/30
 * @description ：
 */
public class MyTest {
    @Test
    public void TestAdvice() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}

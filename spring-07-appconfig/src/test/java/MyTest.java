import com.mj.config.MyConfig;
import com.mj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void testConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());

        User user = (User) context.getBean("user");
        System.out.println(user.getName());

        System.out.println(getUser.hashCode());
        System.out.println(user.hashCode());
        System.out.printf("getUser.equals(user) ? %s", getUser.equals(user));
    }
}

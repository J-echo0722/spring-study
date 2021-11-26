import com.mj.pojo.Student;
import com.mj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : MaJ
 * @date : 2021/11/26
 * @description： 依赖注入 和 命名空间注入
 */
public class MyTest {
    @Test
    public void TestStudentDi() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void TestPNameSpace() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");

        // User user = (User) context.getBean("user");   // 不指定 class
        User user = context.getBean("user", User.class);       // 指定 class，不用强转
        System.out.println(user.toString());
    }
}

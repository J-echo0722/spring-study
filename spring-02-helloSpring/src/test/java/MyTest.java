import com.mj.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : MaJ
 * @date : 2021/11/25
 * @description ：
 */
public class MyTest {
    public static void main(String[] args) {
        // 获取 Spring 的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象由 Spring 管理，要用直接取 getBean
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.getStr());
    }
}

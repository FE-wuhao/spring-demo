import com.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 容器承载了对象的实例化
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloSpring helloObject = (HelloSpring) context.getBean("helloSpring");

        System.out.println(helloObject.toString());

        helloObject.setName("吴灏");

        System.out.println(helloObject.toString());
    }
}

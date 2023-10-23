import com.hax.config.ModuleConfig;
import com.hax.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ModuleConfig.class);
        User user = annotationConfigApplicationContext.getBean("user", User.class);

        System.out.println(user.name);
    }
}
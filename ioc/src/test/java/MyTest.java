import com.springDemo.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 注册spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取userServiceImpl实例
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        // // 获取userDao实例
        // UserDao userDao = (UserDao) context.getBean("userDaoImpl");
        // // 依赖注入userDao实例
        // userService.setUser(userDao);
        // // 执行方法
        // userService.getUserInfo();
        // // 获取userDaoMySQLImpl实例
        // UserDaoMySQLImpl userDaoMySQLImpl = (UserDaoMySQLImpl) context.getBean("userDaoMySQLImpl");
        // // 依赖注入userDaoMySQLImpl实例
        // userService.setUser(userDaoMySQLImpl);
        // // 执行方法
        // userService.getUserInfo();
        // // 获取userDaoOracleImpl实例
        // UserDaoOracleImpl userDaoOracleImpl = (UserDaoOracleImpl) context.getBean("userDaoOracleImpl");
        // // 依赖注入userDaoOracleImpl实例
        // userService.setUser(userDaoOracleImpl);
        // // 执行方法
        // userService.getUserInfo();

        // 通过配置文件动态切换service绑定的实例
        // 执行方法
        userService.getUserInfo();
    }
}
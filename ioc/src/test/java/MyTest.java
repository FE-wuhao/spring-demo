import com.springdemo.dao.UserDaoImpl;
import com.springdemo.dao.UserDaoMySQLImpl;
import com.springdemo.dao.UserDaoOracleImpl;
import com.springdemo.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUser(new UserDaoMySQLImpl());

        userService.getUserInfo();

    }
}

package mapper;

import com.czy.dao.UserDao;
import com.czy.domain.User;
import com.czy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class UserTest {

    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;

    @Test
    public void findAllUserTest(){
        List<User> userList = userService.findAllUser();
        System.out.println(userList);
    }

    @Test
    public void insertUserTest(){
        User user = new User(null,"bl","123456","1234567");
        userService.insertUser(user);
        findAllUserTest();
    }

    @Test
    public void updateUserTest(){
        User user = new User(3,"lx","123456","1234567");
        userService.updateUser(user);
        findAllUserTest();
    }

    @Test
    public void findUserByIdTest(){
        Integer id = 2;
        System.out.println(userDao.findUserById(id));
    }

    @Test
    public void loginTest(){
        User user = userService.login("19921879687", "123456");
        System.out.println(user);
    }

    @Test
    public void findUserByPhoneTest(){
        User user = userService.findUserByPhone("11111");
        System.out.println(user);
    }
}

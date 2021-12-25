package mapper;

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

}

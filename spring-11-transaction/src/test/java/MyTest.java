import com.hito.mapper.UserMapper;
import com.hito.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext Context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = Context.getBean("usermapperimpl", UserMapper.class);
        List<User> userList = userMapper.selectUser();

        for (User user : userList) {
            System.out.println(user);
        }
    }
}

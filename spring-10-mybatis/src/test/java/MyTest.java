import com.hito.mapper.UserMapper;
import com.hito.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }

    @Test
    public void test2() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
                UserMapper userMapper2 = context.getBean("userMapper2", UserMapper.class);
        for (User user : userMapper2.selectUser()) {
            System.out.println(user);
        }
    }
}

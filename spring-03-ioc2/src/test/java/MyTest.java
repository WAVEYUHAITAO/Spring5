import com.hito.pojo.User;
import com.hito.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //配置文件加载的时候所有的bean都已经被实例化了
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user = (UserT) context.getBean("userT3");
        user.show();
    }
}

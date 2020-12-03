package man.kuke;

import static org.junit.Assert.assertTrue;

import man.kuke.model.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);

    }
}

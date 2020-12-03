package man.kuke;

import static org.junit.Assert.assertTrue;

import man.kuke.model.People;
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
    public void shouldAnswerWithTrue()  {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("People", People.class);
        System.out.println(people.getCat());
        System.out.println(people.getDog());
    }
}

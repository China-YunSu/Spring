package kuke;

import man.kuke.dao.UserDao;
import man.kuke.dao.UserDaoImpl;
import man.kuke.model.Student;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");

        UserDaoImpl daoImpl = (UserDaoImpl) context.getBean("UserDaoImpl");
        UserDao userDao = daoImpl.getUserDao();
        userDao.show();
    }

    @Test
    public void getStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
        Student student = (Student) context.getBean("Student");
        System.out.println(student);
    }
}

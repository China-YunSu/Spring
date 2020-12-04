package man.kuke;

import static org.junit.Assert.assertTrue;

import man.kuke.dao.MybatisUtils;
import man.kuke.dao.UserMapper;
import man.kuke.model.Person;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Person> people = mapper.getPeople();
        for (Person person : people) {
            System.out.println(person);
        }

        sqlSession.close();
    }

    @Test
    public void Demo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImp = (UserMapper) context.getBean("userMapper");
        List<Person> people = userMapperImp.getPeople();
        for (Person person : people) {
            System.out.println(person);
        }
    }

}

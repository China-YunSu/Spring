package man.kuke.dao;

import man.kuke.model.Person;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/12/4 - 14:51
 * @description:
 */
public class UserMapperImp2 extends SqlSessionDaoSupport implements UserMapper{

    public UserMapperImp2(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<Person> getPeople() {
        return getSqlSession().getMapper(UserMapper.class).getPeople();
    }
}

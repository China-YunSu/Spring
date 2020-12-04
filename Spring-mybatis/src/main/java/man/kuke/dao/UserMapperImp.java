package man.kuke.dao;

import man.kuke.model.Person;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author: kuke
 * @date: 2020/12/4 - 12:36
 * @description:
 */
public class UserMapperImp implements UserMapper{
    private SqlSessionTemplate sqlSessTemp;

    public UserMapperImp(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessTemp = sqlSessionTemplate;
    }

    public void setSqlSessTemp(SqlSessionTemplate sqlSessTemp) {
        this.sqlSessTemp = sqlSessTemp;
    }

    public List<Person> getPeople() {
        UserMapper mapper = sqlSessTemp.getMapper(UserMapper.class);
        return mapper.getPeople();
    }
}

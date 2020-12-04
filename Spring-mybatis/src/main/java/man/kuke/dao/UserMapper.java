package man.kuke.dao;

import man.kuke.model.Person;

import java.util.List;
import java.util.Map;

/**
 * @author: kuke
 * @date: 2020/11/29 - 13:42
 * @description:
 */
public interface UserMapper {
    //查询所有
    List<Person> getPeople();

}

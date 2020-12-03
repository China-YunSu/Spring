package man.kuke.dao;

/**
 * @author: kuke
 * @date: 2020/12/3 - 15:59
 * @description:
 */
public class UserDaoMysqlImpl implements UserDao{
    private String name;

    public UserDaoMysqlImpl() {
    }

    public UserDaoMysqlImpl(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}

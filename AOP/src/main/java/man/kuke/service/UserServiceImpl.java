package man.kuke.service;

/**
 * @author: kuke
 * @date: 2020/12/3 - 22:26
 * @description:
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add one recording");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个记录");
    }
}

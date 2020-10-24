package cn.hellotqq.dao;

import cn.hellotqq.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author ： tqq
 * @date ： 2020/10/23 12:48
 * @Description:
 */
public interface UserMapper {
    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    int addUser2(Map<String, Object> map);

    List<User> getUserListByName(String name);
    List<User> getUserListByName1(String name);
}

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

    User getUserById(int id);

    List<User> getUserByLimit(Map<String,Integer> map);

    List<User> getUserByRowRounds();

}
package cn.hellotqq.dao;

import cn.hellotqq.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


/**
 * @author ： tqq
 * @date ： 2020/10/23 12:48
 * @Description:
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUser();

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    // 方法存在多个参数的时候，所有的参数前面都必须加上@Param("")
    @Select("select * from user where id = #{id} and name = #{name}")
    User getUserByIdAndName(@Param("id") int id,@Param("name") String name);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name =#{name},pwd = #{pwd} where id = #{id}")
    int updataUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id2314);
    /**
     * 我们在SQL中引用的就是我们这里的@Param()中设定的属性名
     */



}
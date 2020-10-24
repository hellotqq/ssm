import cn.hellotqq.dao.UserMapper;
import cn.hellotqq.pojo.User;
import cn.hellotqq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author ： tqq
 * @date ： 2020/10/23 12:51
 * @Description:
 */

public class UserDaoTest {
    /**
     * 测试查询全部    */
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user: userList) {
            System.out.println(user);
        }
    }

    /**
     * 测试通过Id查询
     */
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(3);
        System.out.println(user);
        sqlSession.close();
    }

    /**
     * 测试添加
     */
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(100);
        user.setName("weige12");
        user.setPwd("ghjkhkgj");
        System.out.println(user);
        int i = userDao.addUser(user);
        sqlSession.commit();
        System.out.println(i);
        sqlSession.close();
    }

    /**
     * 测试更新
     */
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(100);
        user.setName("伟哥");
        user.setPwd("123456");
        int i = userDao.updateUser(user);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试删除
     */
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        int i = userDao.deleteUser(100);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试Map
     */
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",9);
        map.put("name","刘屹");
        map.put("pwd","1314520");
        int i = userDao.addUser2(map);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 模糊查询测试
     */
    @Test
    public void test6(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> list = userDao.getUserListByName("q");
        System.out.println(list);
        sqlSession.close();
    }
    @Test
    public void test7(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> list = userDao.getUserListByName1("%q%");
        System.out.println(list);
        sqlSession.close();
    }

}

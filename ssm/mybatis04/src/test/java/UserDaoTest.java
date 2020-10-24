import cn.hellotqq.dao.UserMapper;
import cn.hellotqq.pojo.User;
import cn.hellotqq.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
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
     * 测试通过Id查询
     */
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> list = userDao.getUser();
        System.out.println(list);
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(3);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserByIdAndName(1, "tqq");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("pzz");
        user.setPwd("tzz");
        System.out.println(userDao.addUser(user));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(11);
        user.setName("哈哈哈");
        user.setPwd("hhh");
        System.out.println(userDao.updataUser(user));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        System.out.println(userDao.deleteUser(10));
        sqlSession.commit();
        sqlSession.close();
    }
}

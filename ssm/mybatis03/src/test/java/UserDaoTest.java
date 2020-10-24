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
        User user = userDao.getUserById(3);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("startIndex",1);
        map.put("pageSize",2);
        List<User> list = userDao.getUserByLimit(map);
        System.out.println(list);
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        RowBounds rowBounds = new RowBounds(1, 2);

        List<User> list = sqlSession.selectList("cn.hellotqq.dao.UserMapper.getUserByRowRounds", null, rowBounds);
        System.out.println(list);
        sqlSession.close();
    }

}

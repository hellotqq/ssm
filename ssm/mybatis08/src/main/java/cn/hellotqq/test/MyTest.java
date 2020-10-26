package cn.hellotqq.test;

import cn.hellotqq.dao.StudentMapper;
import cn.hellotqq.pojo.Student;
import cn.hellotqq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ： tqq
 * @date ： 2020/10/25 11:00
 * @Description:
 */
public class MyTest {
    @Test
    public void getBlogList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.selAll();
        for (Student student: list) {
            System.out.println(student);
        }
        sqlSession.close();
    }

}

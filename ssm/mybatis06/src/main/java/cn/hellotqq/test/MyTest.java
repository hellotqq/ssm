package cn.hellotqq.test;

import cn.hellotqq.dao.StudentMapper;
import cn.hellotqq.dao.TeacherMapper;
import cn.hellotqq.pojo.Student;
import cn.hellotqq.pojo.Teacher;
import cn.hellotqq.utils.MybatisUtils;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ： tqq
 * @date ： 2020/10/24 17:07
 * @Description:
 */
public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
     List<Teacher> list = mapper.selAll();
     for (Teacher teacher:list) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> list = mapper.selAll1();
        for (Teacher teacher:list) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

}

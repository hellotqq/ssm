package cn.hellotqq.test;

import cn.hellotqq.dao.StudentMapper;
import cn.hellotqq.dao.TeacherMapper;
import cn.hellotqq.pojo.Student;
import cn.hellotqq.pojo.Teacher;
import cn.hellotqq.utils.MybatisUtils;
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
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.listAll();
        for ( Student student:studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.listAll();
        for ( Student student:studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    /**
     * 多对一查询
     */
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.listAllStudent();
        for ( Student student:studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.selAll1();
        for ( Student student:studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}

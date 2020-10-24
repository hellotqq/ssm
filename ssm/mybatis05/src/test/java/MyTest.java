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
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
       TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getteacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for ( Student student:studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for ( Student student:studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}

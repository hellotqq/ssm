package cn.hellotqq.dao;

import cn.hellotqq.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ： tqq
 * @date ： 2020/10/24 17:02
 * @Description:
 */
public interface TeacherMapper {
//    @Select("select * from teacher where id = #{id}")
//    Teacher getteacher(@Param("id") int id);

    List<Teacher> getTeacher();
    List<Teacher> getTeacher2(int id);
}

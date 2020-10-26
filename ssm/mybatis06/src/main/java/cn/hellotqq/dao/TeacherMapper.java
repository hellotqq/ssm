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
    List<Teacher> selAll();
    List<Teacher> selAll1();

}

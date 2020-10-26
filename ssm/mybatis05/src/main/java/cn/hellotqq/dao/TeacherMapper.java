package cn.hellotqq.dao;

import cn.hellotqq.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ： tqq
 * @date ： 2020/10/24 17:02
 * @Description:
 */
public interface TeacherMapper {
    Teacher selectById(int id);
}

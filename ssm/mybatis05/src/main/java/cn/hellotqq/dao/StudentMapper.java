package cn.hellotqq.dao;

import cn.hellotqq.pojo.Student;

import java.util.List;

/**
 * @author ： tqq
 * @date ： 2020/10/24 17:02
 * @Description:
 */
public interface StudentMapper {
   List<Student> listAll();
   List<Student> listAllStudent();
   List<Student> selAll1();
}

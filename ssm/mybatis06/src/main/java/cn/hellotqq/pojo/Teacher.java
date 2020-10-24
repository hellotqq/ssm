package cn.hellotqq.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author ： tqq
 * @date ： 2020/10/24 17:00
 * @Description:
 */
@Data
public class Teacher {
    private int id;
    private String name;
    //一个老师拥有多个学生
    private List<Student> students;
}

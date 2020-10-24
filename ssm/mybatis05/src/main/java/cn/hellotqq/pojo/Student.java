package cn.hellotqq.pojo;

import lombok.Data;

/**
 * @author ： tqq
 * @date ： 2020/10/24 17:00
 * @Description:
 */
@Data
public class Student {
    private int id;
    private String name;
    //学生需要关联一个老师
    private Teacher teacher;
}

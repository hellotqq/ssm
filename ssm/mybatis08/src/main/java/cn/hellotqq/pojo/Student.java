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
   private int tid;
   private Teacher teacher;
}

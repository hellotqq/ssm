package cn.hellotqq.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author ： tqq
 * @date ： 2020/10/25 10:47
 * @Description:
 */
@Data
public class Blog {
    private int id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}

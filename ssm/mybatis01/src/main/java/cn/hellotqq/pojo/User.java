package cn.hellotqq.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author ： tqq
 * @date ： 2020/10/23 12:25
 * @Description:
 */
@Data
//@Alias("hello")
public class User {
    private int id;
    private String name;
    private String pwd;
}

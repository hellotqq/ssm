package cn.hellotqq.dao;

import cn.hellotqq.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author ： tqq
 * @date ： 2020/10/25 10:49
 * @Description:
 */
public interface BlogMapper {
    List<Blog>  getBlogList(Map<String,Object> map);
}

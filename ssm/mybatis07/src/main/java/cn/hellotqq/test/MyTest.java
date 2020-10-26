package cn.hellotqq.test;

import cn.hellotqq.dao.BlogMapper;
import cn.hellotqq.pojo.Blog;
import cn.hellotqq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ： tqq
 * @date ： 2020/10/25 11:00
 * @Description:
 */
public class MyTest {
    @Test
    public void getBlogList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
       Map<String, Object> map = new HashMap<>();
        map.put("title","平凡的世界");
        map.put("author","");
        List<Blog> blogList = mapper.getBlogList(map);
        for (Blog blog:blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void getBlogList1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("title","平凡的世界");
        map.put("author","");
        List<Blog> blogList = mapper.getBlogList1(map);
        for (Blog blog:blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void getBlogList2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("title","");
        map.put("author","");
        List<Blog> blogList = mapper.getBlogList2(map);
        for (Blog blog:blogList) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(4);
        blog.setTitle("中国武术简章");
//        blog.setViews(123);
        int i = mapper.updateBlog(blog);
        System.out.println(i);
        sqlSession.commit();

        sqlSession.close();
    }
}

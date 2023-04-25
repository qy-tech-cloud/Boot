package com.qy.boot04;

import com.qy.boot04.PO.ArticlePO;
import com.qy.boot04.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Random;

@SpringBootTest
public class MybatisTest {
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void testSelect(){
        ArticlePO articlePO = articleMapper.selectById(1);
        System.out.println("articlePO = " + articlePO);
    }

    @Test
    void testInsert(){
        ArticlePO articlePO = new ArticlePO();
        articlePO.setTitle("Web开发");
        articlePO.setSummary("定制web应用");
        articlePO.setReadCount(11);
        articlePO.setUserId(new Random().nextInt(500));
        articlePO.setCreateTime(LocalDateTime.now());
        articlePO.setUpdateTime(LocalDateTime.now());

        int rows = articleMapper.insertArticle(articlePO);
        System.out.println("rows = " + rows);
    }

    @Test
    void testUpdateReadCount(){
        int i = articleMapper.updateReadCount(4, 88);
        System.out.println("更新行数 = " + i);
    }

    @Test
    void testDeleteById(){
        int i = articleMapper.deleteById(4);
        System.out.println("删除行数 = " + i);
    }


}

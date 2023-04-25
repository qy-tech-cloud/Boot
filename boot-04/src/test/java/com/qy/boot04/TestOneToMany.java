package com.qy.boot04;

import com.qy.boot04.PO.ArticleEntity;
import com.qy.boot04.mapper.ArticleCommentMapper;
import com.qy.boot04.mapper.ArticleOneToOneMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestOneToMany {
    @Autowired
    private ArticleCommentMapper articleCommentMapper;

    @Test
    void testMany(){
        ArticleEntity articleEntity = articleCommentMapper.selectArticleCommentById(1);
        System.out.println("articleEntity = " + articleEntity);


    }
}

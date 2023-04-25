package com.qy.boot04;

import com.qy.boot04.PO.Article;
import com.qy.boot04.mapper.ArticleMapper;
import com.qy.boot04.mapper.ArticleOneToOneMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestOneToOne {
    @Autowired
    private ArticleOneToOneMapper oneMapper;

    @Test
    void testOneToOne() {
        Article article = oneMapper.selectAllArticle(2);
        System.out.println("article = " + article);
    }
}

package com.qy.boot03;

import com.qy.boot03.model.ArticlePO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Boot03ApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void test01(){
        String sql = "select count(*) as ct from article";
        Long count = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println("count = " + count);
    }

    @Test
    void test02(){
        String sql = "select * from article where id = ?";
        ArticlePO articlePO = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(ArticlePO.class), 3);
        System.out.println("articlePO = " + articlePO);
    }

    @Test
    void test03(){
        String sql = "select * from article order by id";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        maps.forEach(el->{
            el.forEach((field,value)->{
                System.out.println("字段名称："+ field+ ",列值:"+ value);
            });
        });
    }


}

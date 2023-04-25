package com.qy.boot04.mapper;

import com.qy.boot04.PO.ArticlePO;
import org.apache.ibatis.annotations.*;

public interface ArticleMapper {
    @Select("""
           select id,user_id,title,summary,read_count,create_time,update_time
           from article where id=#{articleId}
            """)
    ArticlePO selectById(@Param("articleId") Integer id);

    @Insert("""
            insert into article(user_id,title,summary,read_count,create_time,update_time)
            values(#{userId},#{title},#{summary},#{readCount},#{createTime},#{updateTime})
            """)
    int insertArticle(ArticlePO po);

    @Update("""
            update article set read_count=#{readCount} where id=#{id}
            """)
    int updateReadCount(Integer id,Integer readCount);

    @Delete("""
            delete from article where id=#{id}
            """)
    int deleteById(Integer id);
}
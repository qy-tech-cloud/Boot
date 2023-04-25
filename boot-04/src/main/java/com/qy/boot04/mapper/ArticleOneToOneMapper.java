package com.qy.boot04.mapper;

import com.qy.boot04.PO.Article;
import com.qy.boot04.PO.ArticleDetail;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

public interface ArticleOneToOneMapper {
    @Select("""
            select id,article_id,content from article_detail where article_id=#{articleId}
            """)
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "article_id", property = "articleId"),
            @Result(column = "content", property = "content")
    })
    ArticleDetail selectDetailByArticleId(Integer articleId);

    @Select("""
            select id,user_id,title,summary,read_count,create_time,update_time
                       from article where id=#{id}
            """)
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "title",property = "title"),
            @Result(column = "summary",property = "summary"),
            @Result(column = "read_count",property = "readCount"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "update_time",property = "updateTime"),
            @Result(column = "id",property = "articleDetail",
            one = @One(select ="com.qy.boot04.mapper.ArticleOneToOneMapper.selectDetailByArticleId",
            fetchType= FetchType.LAZY))
    })
    Article selectAllArticle(Integer id);
}

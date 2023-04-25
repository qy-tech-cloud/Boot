package com.qy.boot04.PO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArticleDetail {
    private Integer id;
    private Integer articleId;
    private String content;
}

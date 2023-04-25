package com.qy.boot04.PO;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class CommentPO {
    private Integer id;
    private Integer articleId;
    private String content;

}

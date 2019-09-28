package com.huaxin.onestopprocurement.po;

import java.util.Date;

public class Itemcomment {
    private Integer commentId;

    private Integer itemId;

    private Integer userId;

    private String comentInf;

    private Date commentTime;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getComentInf() {
        return comentInf;
    }

    public void setComentInf(String comentInf) {
        this.comentInf = comentInf == null ? null : comentInf.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }
}
package com.qcby.carsProject.entity;

public class TComment {
    private Long id;
    private String userId;
    private int blogId;
    private  String content;
    private String commentDate;
    private int state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TComment{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", blogId=" + blogId +
                ", content='" + content + '\'' +
                ", commentDate='" + commentDate + '\'' +
                ", state=" + state +
                '}';
    }
}

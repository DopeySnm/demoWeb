package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id,String text, Date creationDate) {
        this.id = id;
        this.creationDate = creationDate;
        this.text = text;
        this.likes = 0;
    }

    public String getText() {
        return text;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Integer getLikes() {
        return likes;
    }
}

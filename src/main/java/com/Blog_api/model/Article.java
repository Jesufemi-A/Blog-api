package com.Blog_api.model;


import lombok.Data;

@Data
public class Article {

    private int id;
    private String title;
    private String content;
    private String imageUrl;

    public Article(int id, String title, String content, String imageUrl) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
    }
}

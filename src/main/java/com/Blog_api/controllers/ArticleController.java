package com.Blog_api.controllers;

import com.Blog_api.model.Article;
import com.Blog_api.service.ArticleService;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


    @GetMapping("/articles")
    public List getArticles() {
      return articleService.getArticles();
    }

    @GetMapping("articles/{id}")
    public Article getArticlesById(@PathVariable Integer id) {
       return articleService.getArticlesById(id);
    }

    @PostMapping("/article")
    public void postArticle(@RequestBody Article article) {
            articleService.addArticle(article);
        
    }








}

package com.Blog_api.controllers;

import java.util.*;

import com.Blog_api.model.Article;
import com.Blog_api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ArticleService articleService;

    public HomeController(ArticleService articleService) {
        this.articleService = articleService;
    }



//    @GetMapping({"", "/", "home"})
//    public List home() {
//        return articleService.getArticles();
//    }


    @PostMapping("/addArticle")
    public void postArticle(@RequestBody Article article) {
            articleService.addArticle(article);
        
    }




}

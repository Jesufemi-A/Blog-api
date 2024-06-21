package com.Blog_api.service;


import com.Blog_api.model.Article;
import com.Blog_api.repository.ArticleRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.Optional;

@Service
@Component
public class ArticleService {


    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void addArticle(Article article) {
        articleRepository.save(article);
    }

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    public Article getArticlesById(Integer i) {
        Optional<Article> optionalArticle = articleRepository.findById(i);

        if (optionalArticle.isPresent()) {
            Article article = optionalArticle.get();
            return article;
        } else {
            return null;
        }
    }




}

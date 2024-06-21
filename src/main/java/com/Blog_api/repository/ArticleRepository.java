package com.Blog_api.repository;

import com.Blog_api.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, Integer> {

}

package com.enderstudy.blogapi.controller;

import com.enderstudy.blogapi.model.Article;
import com.enderstudy.blogapi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/articles")
    public Iterable<Article> getList() {
        return this.articleRepository.findAll();
    }
}

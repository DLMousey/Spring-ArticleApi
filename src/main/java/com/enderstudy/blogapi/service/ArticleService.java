package com.enderstudy.blogapi.service;

import com.enderstudy.blogapi.model.Article;

public interface ArticleService {
    Article getById(Long id);
    void createArticle(Long id, String title, String content);
}

package com.enderstudy.blogapi.service;

import com.enderstudy.blogapi.model.Article;
import com.enderstudy.blogapi.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Override
    public Article getById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    @Override
    public void createArticle(Long id, String title, String content) {
        articleRepository.save(new Article(id, title, content));
    }
}

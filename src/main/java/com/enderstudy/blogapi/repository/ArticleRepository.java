package com.enderstudy.blogapi.repository;

import com.enderstudy.blogapi.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}

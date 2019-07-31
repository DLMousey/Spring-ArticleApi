package com.enderstudy.blogapi;

import com.enderstudy.blogapi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApiApplication {

    @Autowired
    private ArticleService articleService;

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BlogApiApplication.class);
        springApplication.run(args);
    }

    public void run(String... strings) {
        articleService.createArticle(Long.valueOf(1), "Hello World", "An article about hello world");
    }
}

package com.unicms.core.service;

import com.unicms.core.model.Article;
import com.unicms.core.repository.ArticleRepository;
import org.springframework.stereotype.Service;


@Service("articleService")
public class ArticleService {

    private ArticleRepository articleRepository;

    public Article findArticleById(int id) {
        return articleRepository.findById(id);
    }
}

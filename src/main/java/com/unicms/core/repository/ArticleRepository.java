package com.unicms.core.repository;

import com.unicms.core.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("articleRepository")
public interface ArticleRepository extends CrudRepository<Article, Long> {
    Article findById(int id);
}
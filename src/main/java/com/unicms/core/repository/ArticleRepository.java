package com.unicms.core.repository;

import com.unicms.core.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
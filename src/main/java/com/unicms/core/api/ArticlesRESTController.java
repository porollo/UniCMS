package com.unicms.core.api;

import com.unicms.core.model.Article;
import com.unicms.core.model.User;
import com.unicms.core.repository.ArticleRepository;
import com.unicms.core.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class ArticlesRESTController {

    private final ArticleRepository articleRepository;

    public ArticlesRESTController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/articles")
    public List<Article> getArticles() {
        return (List<Article>) articleRepository.findAll();
    }

    @GetMapping("/articles/{id}")
    public Optional<Article> getArticle(@PathVariable Long id) {
        return articleRepository.findById(id);
    }

    @PostMapping("/articles")
    void addArticle(@RequestBody Article article) {
        articleRepository.save(article);
    }
    void deleteArticle(@RequestBody Article article) {articleRepository.delete(article);}
}
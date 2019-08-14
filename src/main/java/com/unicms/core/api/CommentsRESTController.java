package com.unicms.core.api;

import com.unicms.core.model.Comment;
import com.unicms.core.model.User;
import com.unicms.core.repository.CommentRepository;
import com.unicms.core.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CommentsRESTController {

    private final CommentRepository commentRepository;

    private CommentsRESTController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @GetMapping("/comments")
    public List<Comment> getComments() {
        return (List<Comment>) commentRepository.findAll();
    }

    @GetMapping("/comments/{id}")
    public Optional<Comment> getComment(@PathVariable Long id) {
        return commentRepository.findById(id);
    }

    @PostMapping("/comments")
    void addComment(@RequestBody Comment comment) {
        commentRepository.save(comment);
    }
    void deleteComment(@RequestBody Comment comment) {commentRepository.delete(comment);}
}
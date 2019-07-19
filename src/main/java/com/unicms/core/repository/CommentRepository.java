package com.unicms.core.repository;

import com.unicms.core.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("commentRepository")
public interface CommentRepository extends CrudRepository<Comment, Long> {
    Comment findById(int id);
}
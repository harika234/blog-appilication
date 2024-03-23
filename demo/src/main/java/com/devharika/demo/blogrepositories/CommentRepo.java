package com.devharika.demo.blogrepositories;

import com.devharika.demo.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment,Integer> {

}

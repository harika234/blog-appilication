package com.devharika.demo.services.impl;

import com.devharika.demo.blogrepositories.CommentRepo;
import com.devharika.demo.blogrepositories.PostRepo;
import com.devharika.demo.entities.Comment;
import com.devharika.demo.entities.Post;
import com.devharika.demo.exceptions.ResourceNotFoundException;
import com.devharika.demo.payloads.CommentDto;
import com.devharika.demo.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private PostRepo postRepo;
    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {

         Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post","post id",postId));
         Comment comment = this.modelMapper.map(commentDto, Comment.class);
         comment.setPost(post);
         Comment savedComment = this.commentRepo.save(comment);
         return  this.modelMapper.map(savedComment,CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment com = this.commentRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment","comment id",commentId));
        this.commentRepo.delete(com);
    }
}

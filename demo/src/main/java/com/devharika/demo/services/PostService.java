package com.devharika.demo.services;

import com.devharika.demo.entities.Post;
import com.devharika.demo.payloads.PostDto;
import com.devharika.demo.payloads.PostResponse;

import java.util.List;

public interface PostService {
    // create

    PostDto createPost(PostDto postDto,Integer userId, Integer categoryId);

    // update

    PostDto updatePost(PostDto postDto, Integer postId);

    // deelete
    void deletePost(Integer postId);

    // get all
    PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy);

    // get single post
    PostDto getPostById(Integer postId);

    // get all posts by category

    List<PostDto> getPostsByCategory(Integer categoryId);

    // get all posts by user
    List<PostDto> getPostsByUser(Integer userId);

    // search posts
    List<PostDto> searchPosts(String keyword);
}

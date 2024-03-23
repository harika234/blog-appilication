package com.devharika.demo.blogrepositories;

import com.devharika.demo.entities.Category;
import com.devharika.demo.entities.Post;
import com.devharika.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {

    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);

}

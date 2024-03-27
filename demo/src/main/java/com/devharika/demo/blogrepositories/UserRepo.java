package com.devharika.demo.blogrepositories;

import com.devharika.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo  extends JpaRepository<User, Integer> {
        Optional<User> findByEmail(String email);
}

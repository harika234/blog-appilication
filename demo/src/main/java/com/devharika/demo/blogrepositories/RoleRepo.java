package com.devharika.demo.blogrepositories;

import com.devharika.demo.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Integer> {

}

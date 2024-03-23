package com.devharika.demo.payloads;

import com.devharika.demo.entities.Category;
import com.devharika.demo.entities.Comment;
import com.devharika.demo.entities.User;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.event.spi.PreInsertEvent;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    @Id
    private  int id;

    private String title;

    private String content;

    private Date addedDate;

    private String imageName;
    private CategoryDto category;

    private UserDto user;

    private Set<CommentDto> comments = new HashSet<>();

}

package miu.edu.todo.dto;

import lombok.Data;
@Data
public class CommentDto {
    private int id;

    private String description;
    private int rating;


    private UserDto user;



}

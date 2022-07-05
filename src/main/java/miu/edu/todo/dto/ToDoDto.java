package miu.edu.todo.dto;

import lombok.Data;

import java.util.List;

@Data
public class ToDoDto {

    private int id;

    private String title;
    private String description;
    private boolean completed;


    private UserDto user;


    private List<CommentDto> comments;

}

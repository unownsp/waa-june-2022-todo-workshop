package miu.edu.todo.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String description;
    private int rating;

    @ManyToOne
    private User user;

    @ManyToOne
    private ToDo toDo;

}

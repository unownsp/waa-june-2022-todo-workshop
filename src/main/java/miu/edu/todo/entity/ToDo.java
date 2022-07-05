package miu.edu.todo.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String description;
    private boolean completed;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "toDo")
    private List<Comment> comments;
}

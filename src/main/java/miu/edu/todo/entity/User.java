package miu.edu.todo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;
    private String password;
    private String fname;
    private String lname;


    @OneToMany(mappedBy = "user")
    private List<ToDo> toDos;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;
}

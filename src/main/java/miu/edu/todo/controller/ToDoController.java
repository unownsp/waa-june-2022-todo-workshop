package miu.edu.todo.controller;


import lombok.AllArgsConstructor;
import miu.edu.todo.dto.BasicToDoDto;
import miu.edu.todo.dto.ToDoDto;
import miu.edu.todo.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/todos")
public class ToDoController {


    private final TodoService todoService;

    @GetMapping
    public List<BasicToDoDto> getAll(){
        return todoService.getAll();
    }

    @GetMapping("/{id}")
    public ToDoDto getById(@PathVariable int id){
        return todoService.getById(id);
    }

}

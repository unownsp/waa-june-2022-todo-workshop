package miu.edu.todo.service;

import miu.edu.todo.dto.BasicToDoDto;
import miu.edu.todo.dto.ToDoDto;

import java.util.List;

public interface TodoService {

    List<BasicToDoDto> getAll();
    
    ToDoDto getById(int id);

}

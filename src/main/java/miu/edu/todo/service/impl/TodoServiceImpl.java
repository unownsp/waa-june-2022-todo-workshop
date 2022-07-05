package miu.edu.todo.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.todo.dto.BasicToDoDto;
import miu.edu.todo.dto.ToDoDto;
import miu.edu.todo.repository.ToDoRepo;
import miu.edu.todo.service.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {

    private final ToDoRepo toDoRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<BasicToDoDto> getAll() {
        var data = toDoRepo.findAll();
        var result = new ArrayList<BasicToDoDto>();

        data.forEach(item->{
            result.add(modelMapper.map(item,BasicToDoDto.class));
        });

        return result;
    }

    @Override
    public ToDoDto getById(int id) {
       var data = toDoRepo.findById(id).get();
       var result = modelMapper.map(data,ToDoDto.class);
       return result;
    }
}

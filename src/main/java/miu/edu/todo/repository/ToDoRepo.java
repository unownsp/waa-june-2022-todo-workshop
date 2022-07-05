package miu.edu.todo.repository;

import miu.edu.todo.entity.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo extends CrudRepository<ToDo,Integer> {
}

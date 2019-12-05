package org.escoladocodigo.vimdiesels.todoapi.service;

import org.escoladocodigo.vimdiesels.todoapi.model.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> list();
    Todo get(Integer id);
    Todo save(Todo todo);
    void delete(Integer id);

}

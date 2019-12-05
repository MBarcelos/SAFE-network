package org.escoladocodigo.vimdiesels.todoapi.dao;

import org.escoladocodigo.vimdiesels.todoapi.model.Todo;

import java.util.List;

public interface TodoDao {

    List<Todo> findAll();
    Todo findById(Integer id);
    Todo saveOrUpdate(Todo todo);
    void delete(Integer id);

}

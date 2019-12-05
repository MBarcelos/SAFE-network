package org.escoladocodigo.vimdiesels.todoapi.service;

import org.escoladocodigo.vimdiesels.todoapi.dao.TodoDao;
import org.escoladocodigo.vimdiesels.todoapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoDao todoDao;

    @Autowired
    public void setTodoDao(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    @Override
    public List<Todo> list() {
        return todoDao.findAll();
    }

    @Override
    public Todo get(Integer id) {
        return todoDao.findById(id);
    }

    @Transactional
    @Override
    public Todo save(Todo todo) {
        return todoDao.saveOrUpdate(todo);
    }

    @Override
    public void delete(Integer id) {
        todoDao.delete(id);
    }
}

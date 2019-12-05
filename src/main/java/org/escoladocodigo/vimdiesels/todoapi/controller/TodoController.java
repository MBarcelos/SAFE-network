package org.escoladocodigo.vimdiesels.todoapi.controller;

import org.escoladocodigo.vimdiesels.todoapi.model.Todo;
import org.escoladocodigo.vimdiesels.todoapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public void setTodoService(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<List<Todo>> listTodos() {
        return new ResponseEntity<>(todoService.list(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<HttpHeaders> addTodo(@RequestBody Todo todo, UriComponentsBuilder uriComponentsBuilder) {

        Todo savedTodo = todoService.save(todo);

        UriComponents uriComponents = uriComponentsBuilder.path("/api/todo/" + savedTodo.getId()).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

}

package org.escoladocodigo.vimdiesels.todoapi.dao;

import org.escoladocodigo.vimdiesels.todoapi.model.Todo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JPATodoDao implements TodoDao {

    private EntityManager em;

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Todo> findAll() {
        return em.createQuery("FROM Todo", Todo.class).getResultList();
    }

    @Override
    public Todo findById(Integer id) {
        return null;
    }

    @Override
    public Todo saveOrUpdate(Todo todo) {
        return em.merge(todo);
    }

    @Override
    public void delete(Integer id) {

    }
}

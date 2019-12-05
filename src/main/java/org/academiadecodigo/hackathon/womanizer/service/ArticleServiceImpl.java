package org.academiadecodigo.hackathon.womanizer.service;

import org.academiadecodigo.hackathon.womanizer.dao.ArticleDao;
import org.academiadecodigo.hackathon.womanizer.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleDao todoDao;

    @Autowired
    public void setTodoDao(ArticleDao todoDao) {
        this.todoDao = todoDao;
    }

    @Override
    public List<Article> list() {
        return todoDao.findAll();
    }

    @Override
    public Article get(Integer id) {
        return todoDao.findById(id);
    }

    @Transactional
    @Override
    public Article save(Article article) {
        return todoDao.saveOrUpdate(article);
    }

    @Transactional()
    @Override
    public void delete(Integer id) {
        todoDao.delete(id);
    }
}

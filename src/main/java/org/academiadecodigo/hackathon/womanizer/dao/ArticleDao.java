package org.academiadecodigo.hackathon.womanizer.dao;

import org.academiadecodigo.hackathon.womanizer.model.Article;

import java.util.List;

public interface ArticleDao {

    List<Article> findAll();
    Article findById(Integer id);
    Article saveOrUpdate(Article article);
    void delete(Integer id);

}

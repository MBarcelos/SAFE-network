package org.academiadecodigo.hackathon.womanizer.dao;

import org.academiadecodigo.hackathon.womanizer.model.Article;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JPAArticleDao implements ArticleDao {

    private EntityManager em;

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Article> findAll() {
        return em.createQuery("FROM Article", Article.class).getResultList();
    }

    @Override
    public Article findById(Integer id) {
        return null;
    }

    @Override
    public Article saveOrUpdate(Article article) {
        return em.merge(article);
    }

    @Override
    public void delete(Integer id) {

    }
}

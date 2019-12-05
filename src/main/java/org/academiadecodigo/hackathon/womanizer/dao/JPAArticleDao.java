package org.academiadecodigo.hackathon.womanizer.dao;

import org.academiadecodigo.hackathon.womanizer.model.Article;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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
        CriteriaQuery<Article> criteriaQuery = em.getCriteriaBuilder().createQuery(Article.class);
        Root<Article> root = criteriaQuery.from(Article.class);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Article findById(Integer id) {
        return em.find(Article.class, id);
    }

    @Override
    public Article saveOrUpdate(Article article) {
        return em.merge(article);
    }

    @Override
    public void delete(Integer id) {
        em.remove(em.find(Article.class, id));
    }
}

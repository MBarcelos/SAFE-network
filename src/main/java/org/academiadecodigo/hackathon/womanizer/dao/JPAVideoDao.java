package org.academiadecodigo.hackathon.womanizer.dao;

import org.academiadecodigo.hackathon.womanizer.model.Video;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class JPAVideoDao implements VideoDao {

    private EntityManager em;

    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Video> findAll() {
        CriteriaQuery<Video> criteriaQuery = em.getCriteriaBuilder().createQuery(Video.class);
        Root<Video> root = criteriaQuery.from(Video.class);
        return em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Video findById(Integer id) {
        return em.find(Video.class, id);
    }

    @Override
    public Video saveOrUpdate(Video video) {
        return em.merge(video);
    }

    @Override
    public void delete(Integer id) {
        em.remove(em.find(Video.class, id));
    }
}

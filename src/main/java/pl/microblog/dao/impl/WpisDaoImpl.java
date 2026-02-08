package pl.microblog.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pl.microblog.dao.WpisDao;
import pl.microblog.model.Wpis;

import java.util.List;

@Transactional
public class WpisDaoImpl implements WpisDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Wpis> getUserTimeline(Integer userId) {
        return em.createQuery(
            "SELECT w FROM Wpis w WHERE w.userId = :id ORDER BY w.createdAt DESC",
            Wpis.class
        )	
        .setParameter("id", userId)
        .getResultList();
    }

    @Override
    public List<Wpis> getPublicTimeline() {
        return em.createQuery(
            "SELECT w FROM Wpis w ORDER BY w.createdAt DESC",
            Wpis.class
        ).getResultList();
    }

    @Override
    public List<Wpis> getFullTimeline(Integer userId) {
        return em.createQuery(
            "SELECT w FROM Wpis w " +
            "WHERE w.userId = :id " +
            "   OR w.userId IN (" +
            "       SELECT f.followsUserId FROM Follower f WHERE f.userId = :id" +
            "   ) " +
            "ORDER BY w.createdAt DESC",
            Wpis.class
        )
        .setParameter("id", userId)
        .getResultList();
    }


    @Override
    public void save(Wpis wpis) {
        em.persist(wpis);
    }
}

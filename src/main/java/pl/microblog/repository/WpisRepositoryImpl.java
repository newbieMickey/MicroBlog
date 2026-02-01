package pl.microblog.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pl.microblog.model.Wpis;
import java.util.List;

@Repository
public class WpisRepositoryImpl implements WpisRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Wpis wpis) {
        em.persist(wpis);
    }

    @Override
    public List<Wpis> findAll() {
        return em.createQuery("SELECT w FROM Wpis w ORDER BY w.dataDodania DESC", Wpis.class)
                 .getResultList();
    }
}
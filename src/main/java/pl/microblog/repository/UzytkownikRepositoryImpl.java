package pl.microblog.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pl.microblog.model.Uzytkownik;

@Repository
public class UzytkownikRepositoryImpl implements UzytkownikRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Uzytkownik u) {
        em.persist(u);
    }

    @Override
    public Uzytkownik findByLogin(String login) {
        return em.createQuery(
                "SELECT u FROM Uzytkownik u WHERE u.login = :login",
                Uzytkownik.class)
            .setParameter("login", login)
            .getSingleResult();
    }
}
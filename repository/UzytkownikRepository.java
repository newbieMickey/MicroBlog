package pl.microblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.microblog.model.Uzytkownik;

import java.util.Optional;

public interface UzytkownikRepository extends JpaRepository<Uzytkownik, Long> {

    Optional<Uzytkownik> findByLogin(String login);

    boolean existsByLogin(String login);
}


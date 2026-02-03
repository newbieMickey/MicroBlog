package pl.microblog.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.microblog.model.Wpis;

public interface WpisRepository extends JpaRepository<Wpis, Long> {
    List<Wpis> findByUzytkownik_Login(String login);
}
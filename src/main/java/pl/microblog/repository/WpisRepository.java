package pl.microblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.microblog.model.Wpis;

public interface WpisRepository extends JpaRepository<Wpis, Long> {
}

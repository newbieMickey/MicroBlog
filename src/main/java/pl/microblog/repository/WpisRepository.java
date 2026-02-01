package pl.microblog.repository;

import pl.microblog.model.Wpis;
import java.util.List;

public interface WpisRepository {
    void save(Wpis wpis);
    List<Wpis> findAll();
}
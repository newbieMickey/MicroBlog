package pl.microblog.repository;

import pl.microblog.model.Uzytkownik;

public interface UzytkownikRepository {
    void save(Uzytkownik u);
    Uzytkownik findByLogin(String login);
}
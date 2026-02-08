package pl.microblog.dao;

import pl.microblog.model.Uzytkownik;

public interface UzytkownikDao {

    Uzytkownik findByLogin(String login);

    void save(Uzytkownik uzytkownik);
}

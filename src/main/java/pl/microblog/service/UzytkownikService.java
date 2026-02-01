package pl.microblog.service;

import pl.microblog.model.Uzytkownik;

public interface UzytkownikService {
    void zarejestruj(Uzytkownik u);
    Uzytkownik znajdzPoLoginie(String login);
}
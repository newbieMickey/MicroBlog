package pl.microblog.service;

import java.util.List;
import pl.microblog.model.Uzytkownik;
import pl.microblog.model.Wpis;

public interface MicroblogService {
    void zarejestruj(Uzytkownik u);
    void dodajWpis(Wpis wpis);
    List<Wpis> pobierzWpisyUzytkownika(String login);
    List<Wpis> pobierzFeed(String login);
    void follow(String followerLogin, String followeeLogin);
}
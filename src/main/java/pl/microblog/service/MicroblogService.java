package pl.microblog.service;

import java.util.List;

import pl.microblog.model.Uzytkownik;
import pl.microblog.model.Wpis;

public interface MicroblogService {

    // Wpisy
    List<Wpis> getTimeline(String login);
    List<Wpis> getFullTimeline(String login);
    List<Wpis> getPublicTimeline();
    void addWpis(String login, String tresc);

    // Uzytkownicy
    Uzytkownik getUzytkownikByLogin(String login);
    void registerUzytkownik(String login, String haslo, String imie, String nazwisko);

    // Followerzy
    void follow(String followerLogin, String followedLogin);
    void unfollow(String followerLogin, String followedLogin);
    boolean isFollowing(String followerLogin, String followedLogin);
}

package pl.microblog.model;

import javax.persistence.*;

@Entity
public class Uzytkownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String haslo;

    public Uzytkownik() {}

    public Uzytkownik(String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}
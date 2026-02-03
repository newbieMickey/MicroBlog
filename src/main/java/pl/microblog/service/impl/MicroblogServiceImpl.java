package pl.microblog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.microblog.model.Uzytkownik;
import pl.microblog.model.Wpis;
import pl.microblog.repository.UzytkownikRepository;
import pl.microblog.repository.WpisRepository;
import pl.microblog.service.MicroblogService;

@Service
@Transactional
public class MicroblogServiceImpl implements MicroblogService {

    @Autowired
    private UzytkownikRepository uzytkownikRepository;

    @Autowired
    private WpisRepository wpisRepository;

    @Override
    public void zarejestruj(Uzytkownik u) {
        uzytkownikRepository.save(u);
    }

    @Override
    public void dodajWpis(Wpis wpis) {
        wpisRepository.save(wpis);
    }

    @Override
    public List<Wpis> pobierzWpisyUzytkownika(String login) {
        return wpisRepository.findByUzytkownik_Login(login);
    }

    @Override
    public List<Wpis> pobierzFeed(String login) {
        List<Wpis> wynik = new ArrayList<>();
        wynik.addAll(wpisRepository.findByUzytkownik_Login(login));
        return wynik;
    }

    @Override
    public void follow(String followerLogin, String followeeLogin) {
        throw new UnsupportedOperationException("follow() jeszcze nie zaimplementowane");
    }
}
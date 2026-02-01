package pl.microblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.microblog.model.Uzytkownik;
import pl.microblog.repository.UzytkownikRepository;

@Service
@Transactional
public class UzytkownikServiceImpl implements UzytkownikService {

    @Autowired
    private UzytkownikRepository uzytkownikRepository;

    @Override
    public void zarejestruj(Uzytkownik u) {
        uzytkownikRepository.save(u);
    }

    @Override
    public Uzytkownik znajdzPoLoginie(String login) {
        return uzytkownikRepository.findByLogin(login);
    }
}
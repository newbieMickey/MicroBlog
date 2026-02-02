package pl.microblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.microblog.model.Wpis;
import pl.microblog.repository.WpisRepository;

@Service
@Transactional
public class WpisServiceImpl implements WpisService {

    @Autowired
    private WpisRepository wpisRepository;

    @Override
    public void dodajWpis(Wpis wpis) {
        wpisRepository.save(wpis);
    }
    @Override
    public void usun(Long id) {
        wpisRepository.deleteById(id);
    }


    @Override
    public List<Wpis> pobierzWszystkie() {
        return wpisRepository.findAll();
    }
}

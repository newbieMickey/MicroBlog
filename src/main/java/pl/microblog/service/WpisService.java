package pl.microblog.service;

import java.util.List;
import pl.microblog.model.Wpis;

public interface WpisService {
    void dodajWpis(Wpis wpis);
    List<Wpis> pobierzWszystkie();
    void usun(Long id);
}

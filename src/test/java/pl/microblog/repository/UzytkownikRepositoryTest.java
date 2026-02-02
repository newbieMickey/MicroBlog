package pl.microblog.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import pl.microblog.model.Uzytkownik;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UzytkownikRepositoryTest {

    @Autowired
    private UzytkownikRepository uzytkownikRepository;

    @Test
    void shouldSaveAndFindUser() {
        // given
        Uzytkownik u = new Uzytkownik("admin", "1234");

        // when
        uzytkownikRepository.save(u);
        Uzytkownik found = uzytkownikRepository.findByLogin("admin").orElse(null);

        // then
        assertNotNull(found);
        assertEquals("admin", found.getLogin());
        assertEquals("1234", found.getHaslo());
    }
}
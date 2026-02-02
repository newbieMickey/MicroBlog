package pl.microblog.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pl.microblog.model.Uzytkownik;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UzytkownikServiceTest {

    @Autowired
    private UzytkownikService uzytkownikService;

    @Test
    void shouldRegisterUser() {
        // given
        Uzytkownik u = new Uzytkownik("admin", "1234");

        // when
        uzytkownikService.zarejestruj(u);

        // then
        Uzytkownik found = uzytkownikService.znajdzPoLoginie("admin");

        assertNotNull(found);
        assertEquals("admin", found.getLogin());
        assertEquals("1234", found.getHaslo());
    }
}
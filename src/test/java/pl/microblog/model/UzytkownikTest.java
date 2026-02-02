package pl.microblog.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UzytkownikTest {

    @Test
    void shouldCreateUzytkownikCorrectly() {
        Uzytkownik u = new Uzytkownik("admin", "1234");

        assertEquals("admin", u.getLogin());
        assertEquals("1234", u.getHaslo());
    }
}
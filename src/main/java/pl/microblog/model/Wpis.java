package pl.microblog.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Wpis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tresc;

    private LocalDateTime dataDodania = LocalDateTime.now();

    public Wpis() {}

    public Wpis(String tresc) {
        this.tresc = tresc;
    }

    public Long getId() {
        return id;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public LocalDateTime getDataDodania() {
        return dataDodania;
    }
}
package pl.microblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import pl.microblog.model.Uzytkownik;
import pl.microblog.service.UzytkownikService;

//@Controller
public class UzytkownikController {

    @Autowired
    private UzytkownikService uzytkownikService;

    @GetMapping("/rejestracja")
    public String pokazFormularz(Model model) {
        model.addAttribute("uzytkownik", new Uzytkownik());
        return "rejestracja";
    }

    @PostMapping("/rejestracja")
    public String zarejestruj(Uzytkownik u) {
        uzytkownikService.zarejestruj(u);
        return "redirect:/";
    }
}
package pl.microblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.microblog.model.Wpis;
import pl.microblog.service.WpisService;

@Controller
public class WpisController {

    @Autowired
    private WpisService wpisService;

    @GetMapping("/wpisy")
    public String listaWpisow(Model model) {
        model.addAttribute("wpisy", wpisService.pobierzWszystkie());
        return "wpisy";
    }

    @PostMapping("/wpisy/dodaj")
    public String dodajWpis(@RequestParam("tresc") String tresc) {
        Wpis wpis = new Wpis();
        wpis.setTresc(tresc);
        wpisService.dodajWpis(wpis);
        return "redirect:/wpisy";
    }
    
    @PostMapping("/wpisy/usun")
    public String usunWpis(@RequestParam("id") Long id) {
        wpisService.usun(id);
        return "redirect:/wpisy";
    }
}

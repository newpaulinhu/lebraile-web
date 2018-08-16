package br.com.lebraile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.lebraile.component.TradutoraComponent;
import br.com.lebraile.util.Pares;


@RestController
public class TradutoraController {
	
	@Autowired
	private TradutoraComponent component;
	
    @GetMapping("/tradutora/letra")
    public Pares traduzirLetra(@RequestParam("letra") Character letra) {
        return component.traduzirLetra(letra);
    }
    
    @PostMapping("/tradutora/texto/{texto}")
    public List<Pares> traduzirTexto(@RequestBody String texto) {
        return component.traduzirTexto(texto);
    }
}

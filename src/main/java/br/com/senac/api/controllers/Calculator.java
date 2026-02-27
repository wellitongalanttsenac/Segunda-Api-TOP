package br.com.senac.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class Calculator {

    @GetMapping("/soma")
    public ResponseEntity<String> soma(@RequestParam double n1, @RequestParam double n2) {
        double soma = n1 + n2;
        return ResponseEntity.ok("Resposta da soma: " + String.valueOf(soma));
    }

    @GetMapping("/divisao")
    public ResponseEntity<String> divisao(@RequestParam double n1, @RequestParam double n2) {
        double res = n1 / n2;
        return ResponseEntity.ok("Resposta da divisao: " + String.valueOf(res));
    }

    @GetMapping("/multiplicacao")
    public ResponseEntity<String> multiplicacao(@RequestParam double n1, @RequestParam double n2) {
        double res = n1 * n2;
        return ResponseEntity.ok("Resposta da multiplicação: " + String.valueOf(res));
    }

    @GetMapping("/subtracao")
    public ResponseEntity<String> subtracao(@RequestParam double n1, @RequestParam double n2) {
        double res = n1 - n2;
        return ResponseEntity.ok("Resposta da subtracao: " + String.valueOf(res));
    }

}

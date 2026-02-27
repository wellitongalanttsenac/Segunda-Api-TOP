package br.com.senac.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping("/teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/eimpar")
    public ResponseEntity<String> eimpar(@RequestParam int number) {
        boolean eimpar = (number % 2) != 0;
        if(eimpar){
            return ResponseEntity.ok("é impar!");
        }

        return ResponseEntity.ok("nao é impar");
    }
}

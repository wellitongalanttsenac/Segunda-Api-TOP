package br.com.senac.api.controllers;

import br.com.senac.api.dto.CalculatorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/calcular")
public class Calculator {

    @GetMapping("/somar")
    public ResponseEntity<CalculatorDto> soma(@RequestParam double n1, @RequestParam double n2) {
        double soma = n1 + n2;

        CalculatorDto somaDto = new CalculatorDto(soma);
        return ResponseEntity.ok(somaDto);
    }

    @GetMapping("/dividir")
    public ResponseEntity<CalculatorDto> divisao(@RequestParam double n1, @RequestParam double n2) {
        double res = n1 / n2;

        CalculatorDto divisaoDto = new CalculatorDto(res);
        return ResponseEntity.ok(divisaoDto);
    }

    @GetMapping("/multiplicar")
    public ResponseEntity<CalculatorDto> multiplicacao(@RequestParam double n1, @RequestParam double n2) {
        double res = n1 * n2;

        CalculatorDto multiplicacaoDto = new CalculatorDto(res);
        return ResponseEntity.ok(multiplicacaoDto);
    }

    @GetMapping("/subtrair")
    public ResponseEntity<CalculatorDto> subtracao(@RequestParam double n1, @RequestParam double n2) {
        double res = n1 - n2;

        CalculatorDto subtracaoDto = new CalculatorDto(res);
        return ResponseEntity.ok(subtracaoDto);
    }

}

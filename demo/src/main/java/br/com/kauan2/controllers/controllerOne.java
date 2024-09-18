package br.com.kauan2.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan
@RequestMapping("/twoController")
public class controllerOne {
    @GetMapping("/01")
    public String metodo() {
        return "Api 2 pq a outra deu PT";
    }

}

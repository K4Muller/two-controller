package br.com.kauan2.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class controllerOne {
    @GetMapping("/java/{id}")
    public String metodo(@PathVariable String id) {
        return "O parametro é " + id;
    }

    @GetMapping("/java/medotoQuery1")
    public String metodoQueryParams(@RequestParam String id) {
        return "Parametro com metodoQueryParams é " + id;
    }

    @GetMapping("/java/medotoQuery2")
    public String metodoQueryParams2(@RequestParam Map<String, String> allParams) {
        return "Parametro com metodoQueryParams2 é " + allParams.entrySet();
    }
}

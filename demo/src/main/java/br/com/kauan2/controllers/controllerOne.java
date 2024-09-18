package br.com.kauan2.controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
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

    //Aula de body params
    @PostMapping("/java/metodoBodyParams")
    public String metodoBodyParams(@RequestBody User user) {
        return "metodoComBodyParams " + user.username();
    }
    record User(String username){

    }

    //Aula sobre header
    @PostMapping("/java/metodoHeaderParams")
    public String metodoHeader(@RequestHeader("name") String name) {
        return "metodoComHeaderParams " + name;

    }

    //Usando lista no header
    @PostMapping("/java/metodoListHeaderParams")
    public String metodoListHeader(@RequestHeader Map<String, String> headers) {
        return "metodoComHeaderParams " + headers.entrySet();
    }

    //Aula de Response Entity
    @GetMapping("/java/responseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable long id) {
        var usuario = new User1("KAUAN");

        if (id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.badRequest().body("Numero menor que 5");
    }
    record User1(String username){

    }

    
}

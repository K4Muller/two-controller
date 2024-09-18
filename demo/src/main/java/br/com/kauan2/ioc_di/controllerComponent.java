package br.com.kauan2.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class controllerComponent {
    
    @Autowired //Gerecia componentes
    myComponent meuComponent;

    @GetMapping("/")
    public String chamandoComponent() {

        var resultado = meuComponent.chamarMeuComponent();

        return resultado;
    }
}

package br.com.kauan2.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class myComponent {
    
    public String chamarMeuComponent() {
        return "Chamando meu component";
    }
}

package io.github.danielncosta;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //essa anotacao inicializará uma applicaçao springboot
@ComponentScan(
        basePackages = {"io.github.danielncosta.repository",
                        "io.github.danielncosta.service",
                        "io.github.danielncosta"
        }) //serve para especificar
@RestController //será um controlador rest
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")//essa anotação ira injetar o valor da String na variável abaixo
    private String applicationName;


    @Value("${saudacoes}")
    private String saudacoes;

    @GetMapping("/hello")
    public String helloWorld(){
        return saudacoes + applicationName;
    }




    public static void main (String [] args){

        SpringApplication.run(VendasApplication.class, args);
    }
}

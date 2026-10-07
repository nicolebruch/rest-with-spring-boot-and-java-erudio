package br.com.erudio.rest_with_spring_boot_and_java_erudio.controllers;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//essa classe recebe requisicoes http e pode responder dados
@RestController
public class GreetingController {

    // %s! --> um espaco onde entra um texto
    private static final String template = "Hello %s!";
    //contador, pois a cada chamada recebemos um id diferente
    private final AtomicLong counter = new AtomicLong();

    // http://localhost:8080/greeting?name=Nicole
    //query params --> ?name=Nicole

    //quando alguem acessar /greeting, executa esse metodo
    @RequestMapping("/greeting")
    //metodo que retorna um objeto do tipo Greeting
    public Greeting greeting(
            /* procura um parâmetro chamado name na url, então:
            /greeting?name=Nicole faz name = "Nicole";

            mas se eu acessar sem passar nome, somente /greeting:
            o Spring usa defaultValue = "Word"
            */
            @RequestParam(value = "name", defaultValue = "World")
            String name) {

        //o return incrementa contador e a string que vai ser mostrada
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }
}

package br.com.artigo.livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping("/hello") // endereço da pagina /hello
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) { // le o nome como parametro e caso nao tenha nenhum nome o World é atribuido
        return String.format ("Hello %s", name);
    }
}

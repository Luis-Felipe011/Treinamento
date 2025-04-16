package br.com.artigo.livro.controller;


import br.com.artigo.livro.controller.entity.Categoria;
import br.com.artigo.livro.controller.entity.Livro;
import br.com.artigo.livro.controller.entity.Modelo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Arrays;
import java.util.List;


@Controller // para o spring localizar a classe para que possa receber requisições e enviar respostas aos usuarios
public class LivroController {

    @ResponseBody //resposansavel por retornar um json
    @RequestMapping("/livros") // toda fez que p endereço /livros for chamado, o metodo lstar e´executado.
    public List<Livro> listar(){
        Livro livro = new Livro(123l, "Controller - Spring", 1, "Luis", Categoria.INFORMATICA, Modelo.EBOOK);
        return Arrays.asList(livro, livro, livro);


    }
}

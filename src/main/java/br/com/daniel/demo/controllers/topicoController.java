package br.com.daniel.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.demo.controllers.Dto.TopicoDto;
import br.com.daniel.demo.src.main.java.br.com.alura.forum.model.Curso;
import br.com.daniel.demo.src.main.java.br.com.alura.forum.model.Topico;

@RestController
public class topicoController {

    @RequestMapping("/topicos") 
  
    public List <TopicoDto> lista(){
        Topico topico = new Topico("Duvida", "Duvidas sobre Spring", new Curso("Spring", "Programacao"));



        return TopicoDto.converter(Arrays.asList(topico, topico)) ;

       }   
    
}

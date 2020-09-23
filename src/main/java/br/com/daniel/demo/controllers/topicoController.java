package br.com.daniel.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.demo.controllers.Dto.TopicoDto;
import br.com.daniel.demo.controllers.Repository.TopicoRepository;
import br.com.daniel.demo.src.main.java.br.com.alura.forum.model.Topico;


@RestController
public class topicoController {
    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(String nomeCurso) {
        if (nomeCurso == null){
        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDto.converter( topicos );

        } else {

            List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
            return TopicoDto.converter( topicos );
        }   

        

       }   
    
}

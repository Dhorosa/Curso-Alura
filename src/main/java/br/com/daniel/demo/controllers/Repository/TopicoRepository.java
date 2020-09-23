package br.com.daniel.demo.controllers.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.daniel.demo.src.main.java.br.com.alura.forum.model.Topico; 

public interface TopicoRepository extends JpaRepository< Topico , Long > {

    List<Topico> findByCursoNome(String nomeCurso);

}
    


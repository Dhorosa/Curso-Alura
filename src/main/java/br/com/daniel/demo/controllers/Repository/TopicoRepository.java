package br.com.daniel.demo.controllers.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import br.com.daniel.demo.src.main.java.br.com.alura.forum.model.Topico; 

public interface TopicoRepository extends JpaRepository< Topico , Long > {

}
    


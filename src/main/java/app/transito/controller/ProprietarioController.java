package app.transito.controller;

import app.transito.domain.model.Proprietario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {
    @PersistenceContext //variável manager forneça uma instância de EntityManager
    private EntityManager manager;//gerenciador de entidade interface implementada pelo hibernate

@GetMapping("/proprietarios")
public List<Proprietario> listar(){
    TypedQuery<Proprietario> query = manager.createQuery("from Proprietario",Proprietario.class);

    return query.getResultList();
}

}

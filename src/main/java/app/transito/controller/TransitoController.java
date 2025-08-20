package app.transito.controller;

import app.transito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TransitoController {

@GetMapping("/proprietarios")
public List<Proprietario> listar(){
    var proprietario1 = new Proprietario();
    proprietario1.setId(1L);
    proprietario1.setNome("Vitor");
    proprietario1.setEmail("vitor@gmail.com");
    proprietario1.setTelefone("0000-0000");

    var proprietario2 = new Proprietario();
    proprietario2.setId(2L);
    proprietario2.setNome("Felipe");
    proprietario2.setEmail("felipe@gmail.com");
    proprietario2.setTelefone("0000-0001");

    return Arrays.asList(proprietario1,proprietario2);
}

}

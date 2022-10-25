package com.example.livros.controller;

import com.example.livros.model.Editora;
import com.example.livros.reporitory.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping ("/apiEditora")
public class EditoraController implements Controller<Editora, String> {

    @Autowired
    EditoraRepository edRepo;

    @GetMapping ("/todos")
    public List<Editora> buscarTodos() {
        return edRepo.findAll();
    }

    @GetMapping("/ormo")
    public String oiOrmo() {
        return "<b>Heyhey</b>";
    }

}

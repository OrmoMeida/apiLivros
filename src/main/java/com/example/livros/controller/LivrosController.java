package com.example.livros.controller;


import com.example.livros.model.Livros;
import com.example.livros.reporitory.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/apiLivros")

public class LivrosController implements Controller<Livros, Integer> {
    @Autowired
    LivrosRepository alRepo;

    @GetMapping ("/todos")
    public List<Livros> buscarTodos() {
        return alRepo.findAll();
    }
}

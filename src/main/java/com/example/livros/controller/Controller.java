package com.example.livros.controller;

import java.util.List;

public interface Controller<T, ID> {
    List<T> buscarTodos();
}

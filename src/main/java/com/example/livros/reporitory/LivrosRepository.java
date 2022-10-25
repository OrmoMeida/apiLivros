package com.example.livros.reporitory;

import com.example.livros.model.Livros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<Livros, Integer> {
}

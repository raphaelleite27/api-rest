package com.produtos.apirest.repository;

import com.produtos.apirest.models.Categorias;
import com.produtos.apirest.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Produtos, Long>{
	Categorias findById(long id);
}

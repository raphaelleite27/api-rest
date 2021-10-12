package com.produtos.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import com.produtos.apirest.models.Produtos;
import com.produtos.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtoss")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@ApiOperation(value="Retorna uma lista de Produtoss")
	@GetMapping("/produtos")
	public List<Produtos> listaProdutoss(){
		return produtoRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um produto unico")
	@GetMapping("/produto/{id}")
	public Produtos listaProdutosUnico(@PathVariable(value="id") long id){
		return produtoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um produto")
	@PostMapping("/produto")
	public Produtos salvaProdutos(@RequestBody @Valid Produtos produto) {
		return produtoRepository.save(produto);
	}
	
	@ApiOperation(value="Deleta um produto")
	@DeleteMapping("/produto")
	public void deletaProdutos(@RequestBody @Valid Produtos produto) {
		produtoRepository.delete(produto);
	}
	
	@ApiOperation(value="Atualiza um produto")
	@PutMapping("/produto")
	public Produtos atualizaProdutos(@RequestBody @Valid Produtos produto) {
		return produtoRepository.save(produto);
	}
	 

}

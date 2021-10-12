package com.produtos.apirest.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Produtos implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String nome;

	@NotNull
	private Integer estoque;

	@NotNull
	private Double preco;

	@NotNull
	@OneToOne
	@JoinColumn(name = "CATEGORIA_ID")
	private Categorias categoriaId;

	@CreationTimestamp
	@Column(name = "CREATED_AT")
	private Timestamp dataRegistro;

	@UpdateTimestamp
	@Column(name = "UPDATED_AT")
	private Timestamp dataAlteracao;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categorias getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Categorias categoriaId) {
		this.categoriaId = categoriaId;
	}

}

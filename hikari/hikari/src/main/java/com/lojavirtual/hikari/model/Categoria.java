package com.lojavirtual.hikari.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O atributo nome é obrigatório e não aceita espaço em branco.")
	@Size(min = 2, max = 255, message = "O atributo nome aceita entre 2 a 255 caracteres.")
	private long titulo;
	
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	
	//GETTERS AND SETTERS
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTitulo() {
		return titulo;
	}

	public void setTitulo(long titulo) {
		this.titulo = titulo;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	

}

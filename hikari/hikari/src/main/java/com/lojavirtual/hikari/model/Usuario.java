package com.lojavirtual.hikari.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O atributo nome é obrigatório e não aceita espaços em branco")
	@Size(min=2, max=100, message = "O nome deve conter de 2 a 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo usuario é obrigatório e não aceita espaços em branco")
	@Email
	private String usuario;
	
	@NotBlank(message = "O atributo senha é obrigatório e não aceita espaços em branco")
	@Size(min=8, message = "O atributo senha deve conter no mínimo 8 caracteres")
	private String senha;
	
	@Size(min = 10,max = 11, message = "O atributo telefone deve conter de de 10 a 11 caracteres")
	private String telefone;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produto;
	
	//CONSTRUTORES
	public Usuario(long id, String nome, String usuario, String telefone) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.telefone = telefone;
	}

	public Usuario() { };
	
	//GETTERS AND SETTERS
	
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	

}

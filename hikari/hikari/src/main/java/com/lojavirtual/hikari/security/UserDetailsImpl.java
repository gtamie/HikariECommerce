package com.lojavirtual.hikari.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.lojavirtual.hikari.model.Usuario;

public class UserDetailsImpl implements UserDetails {
	
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;
	
	//Métodos construtores 
	
	public UserDetailsImpl(Usuario usuario) {
		
		this.userName = usuario.getUsuario();
		this.password = usuario.getSenha();
	}
	
	
	public UserDetailsImpl() {	}
	
	
	//Métodos de sobreposição
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		return authorities;
	}
	

	@Override
	public String getPassword() {
		
		return password;
	}

	@Override
	public String getUsername() {
		
		return userName;
	}

	
	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}
	

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	
	@Override
	public boolean isEnabled() {
		
		return true;
	}
	


}

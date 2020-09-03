package com.br.unitins.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginController {

	private String usuario;
	

	private String senha;

	public String entrar() {
		
		if(getUsuario().equals("janio") && getSenha().equals("123")) {
			return "index.xhtml";
		}
		System.out.println("Executou o método entrar.");
		System.out.println("usuario"+ usuario);
		System.out.println("usuario"+ senha);
		return "";
	}
	
	public void limpar() {
		usuario = "";
		senha = "";
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
	
}

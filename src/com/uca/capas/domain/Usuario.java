package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(generator = "usuario_id_usuario_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "usuario_id_usuario_seq", sequenceName = "public.usuario_id_usuario_seq", allocationSize = 1)
	@Column(name = "id_usuario")
	private int id_usuario;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "clave")
	private String clave;
	
	public Usuario() {}

	public Usuario(int id_usuario, String usuario, String clave) {
		super();
		this.id_usuario = id_usuario;
		this.usuario = usuario;
		this.clave = clave;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	
}

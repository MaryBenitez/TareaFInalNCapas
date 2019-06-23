package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(generator = "empleado_id_empleado_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "empleado_id_empleado_seq", sequenceName = "empleado_id_empleado_seq", allocationSize = 1)
	@Column(name = "id_empleado")
	private int id_empleado;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "edad")
	private int edad;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "estado")
	private boolean estado;
	
	//   @ManyToOne es la relacion de muchos a uno
	//   @JoinColumn se relaciona a ManyToOne
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sucursal")
	private Sucursal sucursal;
	
	public Empleado() {}

	public Empleado(int id_empleado, String nombre, int edad, String genero, boolean estado, Sucursal sucursal) {
		super();
		this.id_empleado = id_empleado;
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.estado = estado;
		this.sucursal = sucursal;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
}

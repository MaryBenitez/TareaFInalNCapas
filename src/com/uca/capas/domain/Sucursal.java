package com.uca.capas.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "sucursal")
public class Sucursal {

	@Id
	@GeneratedValue(generator = "sucursal_id_sucursal_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_id_sucursal_seq", sequenceName = "sucursal_id_sucursal_seq", allocationSize = 1)
	private int id_sucursal;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "ubicacion")
	private String ubicacion;
	
	@Column(name = "horarios")
	private String horario;
	
	@Column(name = "nmesas")
	private int nmesas;
	
	@Column(name = "nomgerente")
	private String nomgerente;
	
	//  @OneToMany  establece la relacion de 1 a muchos
	//  fetch es repoio y el cascade es para borrar una sucursal y que se borren los empleados de la misma
	@OneToMany(mappedBy = "sucursal", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Empleado> empleado;

	public int getId_sucursal() {
		return id_sucursal;
	}

	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNmesas() {
		return nmesas;
	}

	public void setNmesas(int nmesas) {
		this.nmesas = nmesas;
	}

	public String getNomgerente() {
		return nomgerente;
	}

	public void setNomgerente(String nomgerente) {
		this.nomgerente = nomgerente;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
	
	
}

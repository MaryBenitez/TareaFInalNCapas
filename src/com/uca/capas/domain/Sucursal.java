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
	
	@Column(name = "horario")
	private String horario;
	
	@Column(name = "nmesas")
	private int nmesas;
	
	@Column(name = "nomgerente")
	private String nomgerente;
	
	//  @OneToMany  establece la relacion de 1 a muchos
	//  fetch es repoio y el cascade es para borrar una sucursal y que se borren los empleados de la misma
	@OneToMany(mappedBy = "sucursal", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Empleado> empleado;
	
}

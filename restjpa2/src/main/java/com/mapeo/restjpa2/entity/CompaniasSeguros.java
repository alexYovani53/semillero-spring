package com.mapeo.restjpa2.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANIAS_SEGUROS")
public class CompaniasSeguros implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7178913671192534405L;

	@Id        
	@Column(name="ID")
	private Integer id;
	
	
	@Column(name="NUMERO_POLIZA")
	private Integer numeroPoliza;
	
	
	@Column(name="NOMBRE_COMPANIA")
	private String nombreCompania;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public Integer getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(Integer numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	


}

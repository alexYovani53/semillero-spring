package com.mapeo.restjpa2.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SEGUROS")
public class Seguros implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -789210520875313341L;

	
	@Id
	@Column(name="NUMERO_POLIZA")
	private Integer numeroPoliza;

	@Column(name="RAMO")
	private String ramo;
	
	@Column(name="FECHA_INICIO")
	@Temporal(TemporalType.DATE)
	private Date fechaInicio ;

	@Column(name="FECHA_VENCIMIENTO")
	@Temporal(TemporalType.DATE)
	private Date fechaVencimiento;

	@Column(name="CONDICIONES_PARTICULARES")
	private String condicionesParticulares;
	
	@Column(name="DNI_CL")
	private Integer dniCl;

	public Integer getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(Integer numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getCondicionesParticulares() {
		return condicionesParticulares;
	}

	public void setCondicionesParticulares(String condicionesParticulares) {
		this.condicionesParticulares = condicionesParticulares;
	}

	public Integer getDniCl() {
		return dniCl;
	}

	public void setDniCl(Integer dniCl) {
		this.dniCl = dniCl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
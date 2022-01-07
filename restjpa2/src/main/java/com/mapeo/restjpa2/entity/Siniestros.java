package com.mapeo.restjpa2.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SINIESTROS")
public class Siniestros implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8944979449370142487L;

	
	@Id
	@Column(name="ID_SINIESTRO")
	public Integer idSiniestro;
	
	@Column(name="FECHA_SINIESTRO")
	public Date fechaSiniestro;
	
	@Column(name="CAUSAS")
	public String causas;
	
	@Column(name="ACEPTADO")
	public String aceptado;
	
	@Column(name="INDEMNIZACION")
	public Integer indemnizacion;
	
	@Column(name="NUMERO_POLIZA")
	public Integer numeroPoliza;
	
	@Column(name="DNI_PERITO")
	public Integer dniPerito;

	
	public Integer getIdSiniestro() {
		return idSiniestro;
	}

	public void setIdSiniestro(Integer idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	public Date getFechaSiniestro() {
		return fechaSiniestro;
	}

	public void setFechaSiniestro(Date fechaSiniestro) {
		this.fechaSiniestro = fechaSiniestro;
	}

	public String getCausas() {
		return causas;
	}

	public void setCausas(String causas) {
		this.causas = causas;
	}

	public String getAceptado() {
		return aceptado;
	}

	public void setAceptado(String aceptado) {
		this.aceptado = aceptado;
	}

	public Integer getIndemnizacion() {
		return indemnizacion;
	}

	public void setIndemnizacion(Integer indemnizacion) {
		this.indemnizacion = indemnizacion;
	}

	public Integer getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(Integer numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public Integer getDniPerito() {
		return dniPerito;
	}

	public void setDniPerito(Integer dniPerito) {
		this.dniPerito = dniPerito;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}

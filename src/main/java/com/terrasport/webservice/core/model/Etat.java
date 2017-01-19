package com.terrasport.webservice.core.model;

import java.io.Serializable;

public class Etat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -84913273761951510L;
	
	private Integer id;
	private String libelle;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
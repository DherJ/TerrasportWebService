package com.terrasport.webservice.core.model;

import java.io.Serializable;

public class CompetenceSport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6130578106298360271L;
	
	private Sport sport;
	private Niveau niveau;
	
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
}
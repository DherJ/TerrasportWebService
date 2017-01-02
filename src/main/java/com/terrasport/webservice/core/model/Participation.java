package com.terrasport.webservice.core.model;

import java.sql.Timestamp;
import java.util.List;

public class Participation {

	private List<Utilisateur> utilisateurs;
	private Evenement evenement;
	private Timestamp date;
	
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	public Evenement getEvenement() {
		return evenement;
	}
	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
}
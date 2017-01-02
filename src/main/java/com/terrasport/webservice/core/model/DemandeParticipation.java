package com.terrasport.webservice.core.model;

import java.sql.Timestamp;

public class DemandeParticipation {

	private Utilisateur utilisateur;
	private Evenement evenement;
	private Etat etat;
	private Timestamp dateDemande;
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Evenement getEvenement() {
		return evenement;
	}
	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public Timestamp getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Timestamp date) {
		this.dateDemande = date;
	}
}
package com.terrasport.webservice.core.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class DemandeParticipation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3861543672037462396L;
	
	private Integer id;
	private Utilisateur utilisateurConnecte;
	private Utilisateur utilisateur;
	private Evenement evenement;
	private Etat etat;
	private Timestamp dateDemande;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Utilisateur getUtilisateurConnecte() {
		return utilisateurConnecte;
	}
	public void setUtilisateurConnecte(Utilisateur utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}
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
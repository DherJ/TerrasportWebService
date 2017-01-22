package com.terrasport.webservice.core.event;

import java.util.List;

import com.terrasport.webservice.core.model.Utilisateur;

public class AllUtilisateurEvent {

	private List<Utilisateur> utilisateurs;

	public AllUtilisateurEvent(List<Utilisateur> all) {
		this.utilisateurs = all;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
}
package com.terrasport.webservice.core.service;

import java.util.List;

import com.terrasport.webservice.core.model.Evenement;

public interface EvenementService {

	public List<Evenement> getAll();
	
	public List<Evenement> getEvenementsPublic();
	
	public List<Evenement> getEvenementsPrive();
	
	public List<Evenement> getAllBySport(final Integer sportId);
	
	public void sauvegarder(final Evenement evenement);
	
	public void supprimer(final Evenement evenement);
	
	public void ajouterMembre(final Evenement evenement);
	
	public void supprimerMembre(final Evenement evenement);
}

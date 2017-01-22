package com.terrasport.webservice.core.service;

import com.terrasport.webservice.core.event.AllEvenementEvent;
import com.terrasport.webservice.core.model.Evenement;

public interface EvenementService {

	public AllEvenementEvent getAll();
	
	public AllEvenementEvent getEvenementsPublic();
	
	public AllEvenementEvent getEvenementsPrive();
	
	public AllEvenementEvent getAllBySport(final Integer sportId);
	
	public AllEvenementEvent getAllByUtilisateur(Integer utilisateurId);
	
	public AllEvenementEvent getAllAVenirByUtilisateur(Integer utilisateurId);
	
	public Evenement getById(Integer evenementId);
	
	public void sauvegarder(final Evenement evenement);
	
	public void supprimer(final Integer evenementId);
	
	public void ajouterMembre(final Evenement evenement);
	
	public void supprimerMembre(final Evenement evenement);

}

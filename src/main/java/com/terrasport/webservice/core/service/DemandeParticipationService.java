package com.terrasport.webservice.core.service;

import java.util.List;

import com.terrasport.webservice.core.model.DemandeParticipation;

public interface DemandeParticipationService {

public List<DemandeParticipation> getAll();
	
	public List<DemandeParticipation> getAllPourEvenement(final Integer evenementId);
	
	public List<DemandeParticipation> getAllEnAttentePourEvenement(final Integer evenementId);
	
	public List<DemandeParticipation> getAllValideePourEvenement(final Integer evenementId);
	
	public List<DemandeParticipation> getAllPourUtilisateur(final Integer userId);
	
	public DemandeParticipation getById(final Integer demandeParticipationId);
	
	public void sauvegarder(final DemandeParticipation demandeParticipation);
	
	public void miseAjourEtatDemande(final DemandeParticipation demandeParticipation);
	
	public void supprimer(final Integer demandeParticipationId);
}

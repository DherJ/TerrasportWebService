package com.terrasport.webservice.core.service;

import com.terrasport.webservice.core.event.AllDemandeParticipationEvent;
import com.terrasport.webservice.core.model.DemandeParticipation;

public interface DemandeParticipationService {

public AllDemandeParticipationEvent getAll();
	
	public AllDemandeParticipationEvent getAllPourEvenement(final Integer evenementId);
	
	public AllDemandeParticipationEvent getAllEnAttentePourEvenement(final Integer evenementId);
	
	public AllDemandeParticipationEvent getAllValideePourEvenement(final Integer evenementId);
	
	public AllDemandeParticipationEvent getAllPourUtilisateur(final Integer userId);
	
	public DemandeParticipation getById(final Integer demandeParticipationId);
	
	public void sauvegarder(final DemandeParticipation demandeParticipation);
	
	public void miseAjourEtatDemande(final DemandeParticipation demandeParticipation);
	
	public void supprimer(final Integer demandeParticipationId);
}

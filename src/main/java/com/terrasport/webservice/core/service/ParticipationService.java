package com.terrasport.webservice.core.service;

import java.util.List;

import com.terrasport.webservice.core.model.Participation;

public interface ParticipationService {

	public List<Participation> getAll();
	
	public List<Participation> getAllPourEvenement(final Integer evenementId);
	
	public List<Participation> getAllPourUtilisateur(final Integer userId);
	
	public Participation getById(final Integer participationId);
	
	public void sauvegarder(final Participation participation);
}

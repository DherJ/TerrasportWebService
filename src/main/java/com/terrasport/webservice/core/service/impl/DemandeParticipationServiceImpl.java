package com.terrasport.webservice.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terrasport.webservice.core.dao.DemandeParticipationDao;
import com.terrasport.webservice.core.event.AllDemandeParticipationEvent;
import com.terrasport.webservice.core.model.DemandeParticipation;
import com.terrasport.webservice.core.service.DemandeParticipationService;

@Service
public class DemandeParticipationServiceImpl implements DemandeParticipationService {

	@Autowired
	private DemandeParticipationDao demandeParticipationDao;

	@Override
	public AllDemandeParticipationEvent getAll() {
		return new AllDemandeParticipationEvent(this.demandeParticipationDao.getAll());
	}

	@Override
	public AllDemandeParticipationEvent getAllPourEvenement(Integer evenementId) {
		return new AllDemandeParticipationEvent(this.demandeParticipationDao.getAllPourEvenement(evenementId));
	}

	@Override
	public AllDemandeParticipationEvent getAllEnAttentePourEvenement(Integer evenementId) {
		return new AllDemandeParticipationEvent(this.demandeParticipationDao.getAllEnAttentePourEvenement(evenementId));
	}

	@Override
	public AllDemandeParticipationEvent getAllValideePourEvenement(Integer evenementId) {
		return new AllDemandeParticipationEvent(this.demandeParticipationDao.getAllValideePourEvenement(evenementId));
	}

	@Override
	public AllDemandeParticipationEvent getAllPourUtilisateur(Integer userId) {
		return new AllDemandeParticipationEvent(this.demandeParticipationDao.getAllPourUtilisateur(userId));
	}

	@Override
	public DemandeParticipation getById(Integer demandeParticipationId) {
		return this.demandeParticipationDao.getById(demandeParticipationId);
	}

	@Override
	public void sauvegarder(DemandeParticipation demandeParticipation) {
		this.demandeParticipationDao.sauvegarder(demandeParticipation);
	}

	@Override
	public void miseAjourEtatDemande(DemandeParticipation demandeParticipation) {
		this.demandeParticipationDao.miseAjourEtatDemande(demandeParticipation);
	}

	@Override
	public void supprimer(Integer demandeParticipationId) {
		this.demandeParticipationDao.supprimer(demandeParticipationId);
	}
}
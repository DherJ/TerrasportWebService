package com.terrasport.webservice.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terrasport.webservice.core.dao.DemandeParticipationDao;
import com.terrasport.webservice.core.model.DemandeParticipation;
import com.terrasport.webservice.core.service.DemandeParticipationService;

@Service
public class DemandeParticipationServiceImpl implements DemandeParticipationService {

	@Autowired
	private DemandeParticipationDao demandeParticipationDao;

	@Override
	public List<DemandeParticipation> getAll() {
		return this.demandeParticipationDao.getAll();
	}

	@Override
	public List<DemandeParticipation> getAllPourEvenement(Integer evenementId) {
		return this.demandeParticipationDao.getAllPourEvenement(evenementId);
	}

	@Override
	public List<DemandeParticipation> getAllEnAttentePourEvenement(Integer evenementId) {
		return this.demandeParticipationDao.getAllEnAttentePourEvenement(evenementId);
	}

	@Override
	public List<DemandeParticipation> getAllValideePourEvenement(Integer evenementId) {
		return this.demandeParticipationDao.getAllValideePourEvenement(evenementId);
	}

	@Override
	public List<DemandeParticipation> getAllPourUtilisateur(Integer userId) {
		return this.demandeParticipationDao.getAllPourUtilisateur(userId);
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
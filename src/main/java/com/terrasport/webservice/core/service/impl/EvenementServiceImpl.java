package com.terrasport.webservice.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terrasport.webservice.core.dao.EvenementDao;
import com.terrasport.webservice.core.event.AllEvenementEvent;
import com.terrasport.webservice.core.model.Evenement;
import com.terrasport.webservice.core.service.EvenementService;

@Service
public class EvenementServiceImpl implements EvenementService {

	@Autowired
	private EvenementDao evenementDao;

	@Override
	public AllEvenementEvent getAll() {
		return new AllEvenementEvent(this.evenementDao.getAll());
	}

	@Override
	public AllEvenementEvent getEvenementsPublic() {
		return new AllEvenementEvent(this.evenementDao.getEvenementsPublic());
	}

	@Override
	public AllEvenementEvent getEvenementsPrive() {
		return new AllEvenementEvent(this.evenementDao.getEvenementsPrive());
	}

	@Override
	public AllEvenementEvent getAllBySport(Integer sportId) {
		return new AllEvenementEvent(this.evenementDao.getAllBySport(sportId));
	}

	@Override
	public AllEvenementEvent getAllAVenirByUtilisateur(Integer utilisateurId) {
		return new AllEvenementEvent(this.evenementDao.getAllAVenirByUtilisateur(utilisateurId));
	}
	
	@Override
	public AllEvenementEvent getAllByUtilisateur(Integer utilisateurId) {
		return new AllEvenementEvent(this.evenementDao.getAllByUtilisateur(utilisateurId));
	}
	
	@Override
	public Evenement getById(Integer evenementId) {
		return this.evenementDao.getById(evenementId);
	}
	
	@Override
	public void sauvegarder(Evenement evenement) {
		this.evenementDao.sauvegarder(evenement);
	}

	@Override
	public void supprimer(Integer evenementId) {
		this.evenementDao.supprimer(evenementId);
	}

	@Override
	public void ajouterMembre(Evenement evenement) {
		evenement.setNbPlacesRestantes(evenement.getNbPlacesRestantes() + 1);
		this.evenementDao.modifierNbPlacesRestantes(evenement);
	}

	@Override
	public void supprimerMembre(Evenement evenement) {
		evenement.setNbPlacesRestantes(evenement.getNbPlacesRestantes() - 1);
		this.evenementDao.modifierNbPlacesRestantes(evenement);
	}
}
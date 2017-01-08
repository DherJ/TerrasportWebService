package com.terrasport.webservice.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terrasport.webservice.core.dao.EvenementDao;
import com.terrasport.webservice.core.model.Evenement;
import com.terrasport.webservice.core.service.EvenementService;

@Service
public class EvenementServiceImpl implements EvenementService {

	@Autowired
	private EvenementDao evenementDao;

	@Override
	public List<Evenement> getAll() {
		return this.evenementDao.getAll();
	}

	@Override
	public List<Evenement> getEvenementsPublic() {
		return this.evenementDao.getEvenementsPublic();
	}

	@Override
	public List<Evenement> getEvenementsPrive() {
		return this.evenementDao.getEvenementsPrive();
	}

	@Override
	public List<Evenement> getAllBySport(Integer sportId) {
		return this.evenementDao.getAllBySport(sportId);
	}

	@Override
	public List<Evenement> getAllByUtilisateur(Integer utilisateurId) {
		return this.evenementDao.getAllByUtilisateur(utilisateurId);
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
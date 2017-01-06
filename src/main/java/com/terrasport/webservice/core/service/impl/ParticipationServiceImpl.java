package com.terrasport.webservice.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terrasport.webservice.core.dao.ParticipationDao;
import com.terrasport.webservice.core.model.Participation;
import com.terrasport.webservice.core.service.ParticipationService;

@Service
public class ParticipationServiceImpl implements ParticipationService {

	@Autowired
	private ParticipationDao participationDao;

	@Override
	public List<Participation> getAll() {
		return this.participationDao.getAll();
	}

	@Override
	public List<Participation> getAllPourEvenement(Integer evenementId) {
		return this.participationDao.getAllPourEvenement(evenementId);
	}

	@Override
	public List<Participation> getAllPourUtilisateur(Integer userId) {
		// TODO Auto-generated method stub
		return this.participationDao.getAllPourUtilisateur(userId);
	}

	@Override
	public Participation getById(Integer participationId) {
		return this.participationDao.getById(participationId);
	}

	@Override
	public void sauvegarder(Participation participation) {
		this.participationDao.sauvegarder(participation);
	}
}
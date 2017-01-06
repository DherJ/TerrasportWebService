package com.terrasport.webservice.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terrasport.webservice.core.dao.UtilisateurDao;
import com.terrasport.webservice.core.model.Utilisateur;
import com.terrasport.webservice.core.service.UtilisateurService;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurDao utilisateurDao;
	
	@Override
	public List<Utilisateur> getAll() {
		return this.utilisateurDao.getAll();
	}

	@Override
	public Utilisateur getById(Integer id) {
		return this.utilisateurDao.getById(id);
	}

	@Override
	public Utilisateur getByLoginPassword(String login, String password) {
		return this.utilisateurDao.getByLoginPassword(login, password);
	}

	@Override
	public void sauvegarder(Utilisateur utilisateur) {
		this.utilisateurDao.sauvegarder(utilisateur);
	}

	@Override
	public void modifier(Utilisateur utilisateur) {
		this.utilisateurDao.modifier(utilisateur);
	}
}
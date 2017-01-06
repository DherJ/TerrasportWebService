package com.terrasport.webservice.core.service;

import java.util.List;

import com.terrasport.webservice.core.model.Utilisateur;

public interface UtilisateurService {

	public List<Utilisateur> getAll();
	
	public Utilisateur getById(Integer id);
	
	public Utilisateur getByLoginPassword(String login, String password);
	
	public void sauvegarder(Utilisateur utilisateur);
	
	public void modifier(Utilisateur utilisateur);
}

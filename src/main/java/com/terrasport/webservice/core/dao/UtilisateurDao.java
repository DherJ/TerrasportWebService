package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.Utilisateur;

public interface UtilisateurDao {

	public List<Utilisateur> getAll();
	
	public Utilisateur getById(@Param("userId") final Integer userId);
	
	public Utilisateur getByLoginPassword(@Param("login") final String login, @Param("password") final String password);
	
	public void sauvegarder(@Param("user") final Utilisateur utilisateur);
	
	public void modifier(@Param("user") final Utilisateur utilisateur);
}

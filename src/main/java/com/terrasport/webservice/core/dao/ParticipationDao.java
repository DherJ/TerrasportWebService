package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.Participation;

public interface ParticipationDao {

	public List<Participation> getAll();
	
	public List<Participation> getAllPourEvenement(@Param("evenementId") final Integer userId);
	
	public List<Participation> getAllPourUtilisateur(@Param("utilisateurId") final Integer userId);
	
	public List<Participation> getParticipationsAVenir(@Param("utilisateurId") final Integer utilisateurId);
	
	public Participation getById(@Param("participationId") final Integer participationId);
	
	public void sauvegarder(@Param("participation") final Participation participation);

}

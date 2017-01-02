package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.DemandeParticipation;

public interface DemandeParticipationDao {

	public List<DemandeParticipation> getAll();
	
	public List<DemandeParticipation> getAllPourEvenement(@Param("evenementId") final Integer evenementId);
	
	public List<DemandeParticipation> getAllEnAttentePourEvenement(@Param("evenementId") final Integer evenementId);
	
	public List<DemandeParticipation> getAllByUserId(@Param("userId") final Integer userId);
	
	public DemandeParticipation getById(@Param("demandeParticipationId") final Integer demandeParticipationId);
	
	public void sauvegarder(@Param("demandeParticipation") final DemandeParticipation demandeParticipation);
	
	public void miseAjourEtatDemande(@Param("demandeParticipation") final DemandeParticipation demandeParticipation);
	
	public void annuler(@Param("demandearticipation") final DemandeParticipation demandeParticipation);
}

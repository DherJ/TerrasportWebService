package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.Evenement;

public interface EvenementDao {

	public List<Evenement> getAll();
	
	public List<Evenement> getEvenementsPublic();
	
	public List<Evenement> getEvenementsPrive();
	
	public List<Evenement> getAllBySport(@Param("sportId") final Integer sportId);
	
	public List<Evenement> getAllAVenirByUtilisateur(Integer utilisateurId);
	
	public List<Evenement> getAllByUtilisateur(@Param("utilisateurId") final Integer utilisateurId);
	
	public Evenement getById(@Param("evenementId") final Integer evenementId);
	
	public void sauvegarder(@Param("evenement") final Evenement evenement);
	
	public void modifierNbPlacesRestantes(@Param("evenement") final Evenement evenement);
	
	public void supprimer(@Param("evenement") final Integer evenementId);

}

package com.terrasport.webservice.core.model;

public class Evenement {

	private Integer id;
	private boolean prive;
	private Integer nbPlaces;
	private Integer nbPlacesRestantes;
	private Terrain terrain;
	private Sport sport;
	private Niveau niveauCible;
	private Utilisateur utilisateurCreateur;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean getPrive() {
		return prive;
	}
	public void setPrive(boolean prive) {
		this.prive = prive;
	}
	public Integer getNbPlaces() {
		return nbPlaces;
	}
	public void setNbPlaces(Integer nbPlaces) {
		this.nbPlaces = nbPlaces;
	}
	public Integer getNbPlacesRestantes() {
		return nbPlacesRestantes;
	}
	public void setNbPlacesRestantes(Integer nbPlacesRestantes) {
		this.nbPlacesRestantes = nbPlacesRestantes;
	}
	public Terrain getTerrain() {
		return terrain;
	}
	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	public Niveau getNiveauCible() {
		return niveauCible;
	}
	public void setNiveauCible(Niveau niveauCible) {
		this.niveauCible = niveauCible;
	}
	public Utilisateur getUtilisateurCreateur() {
		return utilisateurCreateur;
	}
	public void setUtilisateurCreateur(Utilisateur utilisateurCreateur) {
		this.utilisateurCreateur = utilisateurCreateur;
	}
}
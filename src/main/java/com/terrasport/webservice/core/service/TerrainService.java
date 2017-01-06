package com.terrasport.webservice.core.service;

import java.util.List;

import com.terrasport.webservice.core.model.Terrain;

public interface TerrainService {

	public List<Terrain> getAll();
	
	public List<Terrain> getAllByTypeSport(final Integer sportId);
	
	public List<Terrain> getAllPublic();
	
	public List<Terrain> getAllPrive();
	
	public Terrain getById(final Integer terrainId);
	
	public void sauvegarder(final Terrain terrain);
	
	public void supprimer(final Integer terrainId);
}

package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.Terrain;

public interface TerrainDao {

	public List<Terrain> getAll();
	
	public List<Terrain> getAllByTypeSport(@Param("sportId") final Integer sportId);
	
	public List<Terrain> getAllPublic();
	
	public List<Terrain> getAllPrive();
	
	public Terrain getById(@Param("terrainId") final Integer id);
	
	public void sauvegarder(@Param("terrain") final Terrain terrain);
	
	public void supprimer(@Param("terrainId") final Integer terrainId);
	
}

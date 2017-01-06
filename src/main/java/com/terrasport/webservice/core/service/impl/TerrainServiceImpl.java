package com.terrasport.webservice.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terrasport.webservice.core.dao.TerrainDao;
import com.terrasport.webservice.core.model.Terrain;
import com.terrasport.webservice.core.service.TerrainService;

@Service
public class TerrainServiceImpl implements TerrainService {

	@Autowired
	private TerrainDao terrainDao;

	@Override
	public List<Terrain> getAll() {
		return this.terrainDao.getAll();
	}

	@Override
	public List<Terrain> getAllByTypeSport(Integer sportId) {
		return this.terrainDao.getAllByTypeSport(sportId);
	}

	@Override
	public List<Terrain> getAllPublic() {
		return this.terrainDao.getAllPublic();
	}

	@Override
	public List<Terrain> getAllPrive() {
		return this.terrainDao.getAllPrive();
	}

	@Override
	public Terrain getById(Integer terrainId) {
		return this.terrainDao.getById(terrainId);
	}
	
	@Override
	public void sauvegarder(Terrain terrain) {
		this.terrainDao.sauvegarder(terrain);
	}

	@Override
	public void supprimer(Integer terrainId) {
		this.terrainDao.supprimer(terrainId);
	}
}
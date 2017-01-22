package com.terrasport.webservice.core.event;

import java.util.List;

import com.terrasport.webservice.core.model.Terrain;

public class AllTerrainEvent {

	private List<Terrain> terrains;

	public AllTerrainEvent(List<Terrain> all) {
		this.terrains = all;
	}

	public List<Terrain> getTerrains() {
		return terrains;
	}

	public void setTerrains(List<Terrain> terrains) {
		this.terrains = terrains;
	}
}
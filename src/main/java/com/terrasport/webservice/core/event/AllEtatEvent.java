package com.terrasport.webservice.core.event;

import java.util.List;

import com.terrasport.webservice.core.model.Etat;

public class AllEtatEvent {

	private List<Etat> etats;

	public AllEtatEvent(List<Etat> all) {
		this.etats = all;
	}

	public List<Etat> getEtats() {
		return etats;
	}

	public void setEtats(List<Etat> etats) {
		this.etats = etats;
	}
}
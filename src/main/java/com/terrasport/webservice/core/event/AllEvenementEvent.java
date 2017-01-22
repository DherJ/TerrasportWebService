package com.terrasport.webservice.core.event;

import java.util.List;

import com.terrasport.webservice.core.model.Evenement;

public class AllEvenementEvent {

	private List<Evenement> evenements;

	public AllEvenementEvent(List<Evenement> all) {
		this.evenements = all;
	}

	public List<Evenement> getEvenements() {
		return evenements;
	}

	public void setEvenements(List<Evenement> evenements) {
		this.evenements = evenements;
	}
}
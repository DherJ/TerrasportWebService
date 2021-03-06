package com.terrasport.webservice.core.event;

import java.util.List;

import com.terrasport.webservice.core.model.Niveau;

public class AllNiveauEvent {

	private List<Niveau> niveaux;

	public AllNiveauEvent(List<Niveau> all) {
		this.niveaux = all;
	}

	public List<Niveau> getNiveaux() {
		return niveaux;
	}

	public void setNiveaux(List<Niveau> niveaux) {
		this.niveaux = niveaux;
	}
}
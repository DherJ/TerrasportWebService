package com.terrasport.webservice.core.event;

import java.util.List;

import com.terrasport.webservice.core.model.DemandeParticipation;

public class AllDemandeParticipationEvent {

	private List<DemandeParticipation> demandeParticipation;

	public AllDemandeParticipationEvent(List<DemandeParticipation> all) {
		this.demandeParticipation = all;
	}

	public List<DemandeParticipation> getDemandeParticipations() {
		return demandeParticipation;
	}

	public void setDemandeParticipations(List<DemandeParticipation> demandeParticipation) {
		this.demandeParticipation = demandeParticipation;
	}
}
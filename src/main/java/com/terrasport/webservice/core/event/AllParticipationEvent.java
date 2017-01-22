package com.terrasport.webservice.core.event;

import java.util.List;

import com.terrasport.webservice.core.model.Participation;

public class AllParticipationEvent {

	private List<Participation> participations;

	public AllParticipationEvent(List<Participation> participations) {
		this.participations = participations;
	}
	
	public List<Participation> getParticipations() {
		return participations;
	}

	public void setParticipations(List<Participation> participations) {
		this.participations = participations;
	}
}
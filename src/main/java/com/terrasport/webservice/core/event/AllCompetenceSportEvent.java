package com.terrasport.webservice.core.event;

import java.util.List;

import com.terrasport.webservice.core.model.CompetenceSport;

public class AllCompetenceSportEvent {

	private List<CompetenceSport> competenceSports;

	public List<CompetenceSport> getCompetenceSports() {
		return competenceSports;
	}

	public void setCompetenceSports(List<CompetenceSport> competenceSports) {
		this.competenceSports = competenceSports;
	}
}
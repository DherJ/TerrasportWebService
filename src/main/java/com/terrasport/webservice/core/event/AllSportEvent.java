package com.terrasport.webservice.core.event;

import java.util.List;

import com.terrasport.webservice.core.model.Sport;

public class AllSportEvent {

	private List<Sport> sports;

	public List<Sport> getSports() {
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
}
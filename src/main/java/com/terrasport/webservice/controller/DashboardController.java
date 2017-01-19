package com.terrasport.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.model.Participation;
import com.terrasport.webservice.core.service.DemandeParticipationService;
import com.terrasport.webservice.core.service.ParticipationService;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

	@Autowired
	private DemandeParticipationService demandeParticipationService;
	
	@Autowired
	private ParticipationService participationService;
	
    @RequestMapping(value = "/participations/{id}", method = RequestMethod.GET, produces="application/json")
    public List<Participation> getAllParticipationsAVenir(@PathVariable("id") final Integer utilisateurId) {
        return this.participationService.getParticipationsAVenir(utilisateurId);
    }
}
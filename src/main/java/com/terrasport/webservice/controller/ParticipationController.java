package com.terrasport.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.event.AllParticipationEvent;
import com.terrasport.webservice.core.model.Participation;
import com.terrasport.webservice.core.service.ParticipationService;

@RestController
@RequestMapping("/participation")
public class ParticipationController {

	@Autowired
	private ParticipationService participationService;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces="application/json")
    public AllParticipationEvent getAllParticipation() {
        return new AllParticipationEvent(this.participationService.getAll());
    }
    
    @RequestMapping(value = "/all/evenement/{id}", method = RequestMethod.GET, produces="application/json")
    public AllParticipationEvent getAllParticipationsPourEvenements(@PathVariable("id") final Integer evenementId) {
        return new AllParticipationEvent(this.participationService.getAllPourEvenement(evenementId));
    }
    
    @RequestMapping(value = "/all/utilisateur/{id}", method = RequestMethod.GET, produces="application/json")
    public AllParticipationEvent getAllParticipationsPourUtilisateur(@PathVariable("id") final Integer utilisateurId) {
        return new AllParticipationEvent(this.participationService.getAllPourUtilisateur(utilisateurId));
    }
    
    @RequestMapping(value = "/all-a-venir/utilisateur/{id}", method = RequestMethod.GET, produces="application/json")
    public AllParticipationEvent getAllParticipationsAVenir(@PathVariable("id") final Integer utilisateurId) {
        return this.participationService.getParticipationsAVenir(utilisateurId);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces="application/json")
    public Participation getParticipationById(@PathVariable("id") final Integer participationId) {
        return this.participationService.getById(participationId);
    }
    
    @RequestMapping(value = "/sauvegarder", method = RequestMethod.POST)
    public ResponseEntity<Void> sauvegarderParticipation(@RequestBody final Participation participation) {
        this.participationService.sauvegarder(participation);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
}

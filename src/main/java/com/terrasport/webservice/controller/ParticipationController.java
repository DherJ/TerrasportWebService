package com.terrasport.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.model.Participation;
import com.terrasport.webservice.core.service.ParticipationService;

@RestController
@RequestMapping("/participation")
public class ParticipationController {

	@Autowired
	private ParticipationService participationService;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Participation> getAllParticipation() {
        return this.participationService.getAll();
    }
    
    @RequestMapping(value = "/all/evenement", method = RequestMethod.GET)
    public List<Participation> getAllParticipationsPourEvenements(@RequestParam("evenementId") final Integer evenementId) {
        return this.participationService.getAllPourEvenement(evenementId);
    }
    
    @RequestMapping(value = "/all/utilisateur", method = RequestMethod.GET)
    public List<Participation> getAllParticipationsPourUtilisateur(@RequestParam("utilisateurId") final Integer utilisateurId) {
        return this.participationService.getAllPourUtilisateur(utilisateurId);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Participation getParticipationById(@RequestParam("participationId") final Integer participationId) {
        return this.participationService.getById(participationId);
    }
    
    @RequestMapping(value = "/sauvegarder", method = RequestMethod.POST)
    public ResponseEntity<Void> sauvegarderParticipation(@RequestBody final Participation participation) {
        this.participationService.sauvegarder(participation);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
}

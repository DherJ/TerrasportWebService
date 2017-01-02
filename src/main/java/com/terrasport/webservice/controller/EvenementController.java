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

import com.terrasport.webservice.core.model.Evenement;
import com.terrasport.webservice.core.service.EvenementService;

@RestController
@RequestMapping("/evenement")
public class EvenementController {

	@Autowired
	private EvenementService evenementService;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Evenement> getAllUtilisateur() {
        return this.evenementService.getAll();
    }
    
    @RequestMapping(value = "/public", method = RequestMethod.GET)
    public List<Evenement> getEvenementsPublic() {
        return this.evenementService.getEvenementsPublic();
    }
    
    @RequestMapping(value = "/prive", method = RequestMethod.GET)
    public List<Evenement> getEvenementsPrive() {
        return this.evenementService.getEvenementsPrive();
    }
    
    @RequestMapping(value = "/sport", method = RequestMethod.GET)
    public List<Evenement> getAllBySport(@RequestParam("sportId") final Integer sportId) {
        return this.evenementService.getAllBySport(sportId);
    }
    
    @RequestMapping(value = "/sauvegarder", method = RequestMethod.POST)
    public ResponseEntity<Void> sauvegarderEvenement(@RequestBody final Evenement evenement) {
        this.evenementService.sauvegarder(evenement);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/ajouterMembre", method = RequestMethod.POST)
    public ResponseEntity<Void> ajouterMembre(@RequestBody final Evenement evenement) {
        this.evenementService.ajouterMembre(evenement);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/supprimerMembre", method = RequestMethod.POST)
    public ResponseEntity<Void> supprimerMembre(@RequestBody final Evenement evenement) {
        this.evenementService.supprimerMembre(evenement);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/supprimer", method = RequestMethod.POST)
    public ResponseEntity<Void> supprimerTerrain(@RequestBody final Evenement evenement) {
        this.evenementService.supprimer(evenement);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}

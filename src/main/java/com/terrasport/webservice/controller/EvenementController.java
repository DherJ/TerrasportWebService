package com.terrasport.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.event.AllEvenementEvent;
import com.terrasport.webservice.core.model.Evenement;
import com.terrasport.webservice.core.service.EvenementService;

@RestController
@RequestMapping("/evenement")
public class EvenementController {

	@Autowired
	private EvenementService evenementService;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces="application/json")
    public AllEvenementEvent getAllUtilisateur() {
        return this.evenementService.getAll();
    }
    
    @RequestMapping(value = "/public", method = RequestMethod.GET, produces="application/json")
    public AllEvenementEvent getEvenementsPublic() {
        return this.evenementService.getEvenementsPublic();
    }
    
    @RequestMapping(value = "/prive", method = RequestMethod.GET, produces="application/json")
    public AllEvenementEvent getEvenementsPrive() {
        return this.evenementService.getEvenementsPrive();
    }
    
    @RequestMapping(value = "/sport/{id}", method = RequestMethod.GET, produces="application/json")
    public AllEvenementEvent getAllBySport(@PathVariable("id") final Integer sportId) {
        return this.evenementService.getAllBySport(sportId);
    }
    
    @RequestMapping(value = "/all-a-venir", method = RequestMethod.GET, produces="application/json")
    public AllEvenementEvent getAllAVenir() {
        return this.evenementService.getAllAVenir();
    }
    
    @RequestMapping(value = "/utilisateur/{id}", method = RequestMethod.GET, produces="application/json")
    public AllEvenementEvent getAllByUtilisateur(@PathVariable("id") final Integer utilisateurId) {
        return this.evenementService.getAllByUtilisateur(utilisateurId);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Evenement getById(@PathVariable("id") final Integer evenementId) {
        return this.evenementService.getById(evenementId);
    }
    
    @RequestMapping(value = "/sauvegarder", method = RequestMethod.POST)
    @ResponseBody
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
    
    @RequestMapping(value = "/supprimer/{id}", method = RequestMethod.POST)
    public ResponseEntity<Void> supprimerTerrain(@PathVariable("id") final Integer evenementId) {
        this.evenementService.supprimer(evenementId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}

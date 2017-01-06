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

import com.terrasport.webservice.core.model.DemandeParticipation;
import com.terrasport.webservice.core.service.DemandeParticipationService;

@RestController
@RequestMapping("/demande-participation")
public class DemandeParticipationController {

	@Autowired
	private DemandeParticipationService demandeParticipationService;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<DemandeParticipation> getAllDemandeParticipation() {
        return this.demandeParticipationService.getAll();
    }
    
    @RequestMapping(value = "/all/evenement", method = RequestMethod.GET)
    public List<DemandeParticipation> getAllParticipationsPourEvenement(@RequestParam("evenementId") final Integer evenementId) {
        return this.demandeParticipationService.getAllPourEvenement(evenementId);
    }
    
    @RequestMapping(value = "/all/evenement/{evenementId}/attente", method = RequestMethod.GET)
    public List<DemandeParticipation> getAllParticipationsEnAttentePourEvenement(@RequestParam("evenementId") final Integer evenementId) {
        return this.demandeParticipationService.getAllEnAttentePourEvenement(evenementId);
    }
    
    @RequestMapping(value = "/all/evenement/{evenementId}/validee", method = RequestMethod.GET)
    public List<DemandeParticipation> getAllParticipationsValideePourEvenement(@RequestParam("evenementId") final Integer evenementId) {
        return this.demandeParticipationService.getAllValideePourEvenement(evenementId);
    }
    
    @RequestMapping(value = "/all/utilisateur", method = RequestMethod.GET)
    public List<DemandeParticipation> getAllParticipationsPourUtilisateur(@RequestParam("utilisateurId") final Integer utilisateurId) {
        return this.demandeParticipationService.getAllPourUtilisateur(utilisateurId);
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public DemandeParticipation getDemandeParticipationById(@RequestParam("demandeParticipationId") final Integer demandeParticipationId) {
        return this.demandeParticipationService.getById(demandeParticipationId);
    }
    
    @RequestMapping(value = "/sauvegarder", method = RequestMethod.POST)
    public ResponseEntity<Void> sauvegarderParticipation(@RequestBody final DemandeParticipation demandeParticipation) {
        this.demandeParticipationService.sauvegarder(demandeParticipation);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/miseAjourEtatDemande", method = RequestMethod.POST)
    public ResponseEntity<Void> miseAjourEtatDemande(@RequestBody final DemandeParticipation demandeParticipation) {
        this.demandeParticipationService.miseAjourEtatDemande(demandeParticipation);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
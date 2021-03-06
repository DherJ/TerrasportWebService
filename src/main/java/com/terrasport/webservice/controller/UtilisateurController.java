package com.terrasport.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.event.AllUtilisateurEvent;
import com.terrasport.webservice.core.model.Utilisateur;
import com.terrasport.webservice.core.service.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurService;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces="application/json")
    public AllUtilisateurEvent getAllUtilisateur() {
        return new AllUtilisateurEvent(this.utilisateurService.getAll());
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces="application/json")
    public Utilisateur getUtilisateurById(@PathVariable("id") final Integer utilisateurId) {
        return this.utilisateurService.getById(utilisateurId);
    }
    
    @RequestMapping(value = "/authentification", method = RequestMethod.GET, produces="application/json")
    public Utilisateur getUtilisateurByLoginPassword(@RequestParam("login") final String login, @RequestParam("password") final String password) {
        return this.utilisateurService.getByLoginPassword(login, password);
    }
    
    @RequestMapping(value = "/sauvegarder", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> sauvegarderUtilisateur(@RequestBody final Utilisateur utilisateur) {
        this.utilisateurService.sauvegarder(utilisateur);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/signaler", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Void> signalerUtilisateur(@RequestBody final Utilisateur utilisateur) {
        this.utilisateurService.signaler(utilisateur);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
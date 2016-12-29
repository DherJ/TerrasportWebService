package com.terrasport.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.model.Utilisateur;
import com.terrasport.webservice.core.service.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurService utilisateurService;
	
    @RequestMapping("/all")
    public List<Utilisateur> getAllUtilisateur() {
        return this.utilisateurService.getAll();
    }
}

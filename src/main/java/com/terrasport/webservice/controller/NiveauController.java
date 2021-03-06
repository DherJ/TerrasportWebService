package com.terrasport.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.dao.NiveauDao;
import com.terrasport.webservice.core.event.AllNiveauEvent;

@RestController
@RequestMapping("/niveau")
public class NiveauController {

	@Autowired
	private NiveauDao niveauDao;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces="application/json")
    public AllNiveauEvent getAllNiveau() {
        return new AllNiveauEvent(this.niveauDao.getAll());
    }
}

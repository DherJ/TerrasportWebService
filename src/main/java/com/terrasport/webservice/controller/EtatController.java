package com.terrasport.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.dao.EtatDao;
import com.terrasport.webservice.core.event.AllEtatEvent;

@RestController
@RequestMapping("/etat")
public class EtatController {

	@Autowired
	private EtatDao etatDao;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces="application/json")
    public AllEtatEvent getAllEtat() {
        return new AllEtatEvent(this.etatDao.getAll());
    }
}

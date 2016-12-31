package com.terrasport.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.dao.EtatDao;
import com.terrasport.webservice.core.model.Etat;

@RestController
@RequestMapping("/etat")
public class EtatController {

	@Autowired
	private EtatDao etatDao;
	
    @RequestMapping("/all")
    public List<Etat> getAllEtat() {
        return this.etatDao.getAll();
    }
}

package com.terrasport.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.dao.NiveauDao;
import com.terrasport.webservice.core.model.Niveau;

@RestController
@RequestMapping("/niveau")
public class NiveauController {

	@Autowired
	private NiveauDao niveauDao;
	
    @RequestMapping("/all")
    public List<Niveau> getAllNiveau() {
        return this.niveauDao.getAll();
    }
}
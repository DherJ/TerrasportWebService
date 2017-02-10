package com.terrasport.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.dao.SportDao;
import com.terrasport.webservice.core.event.AllSportEvent;

@RestController
@RequestMapping("/sport")
public class SportController {

	@Autowired
	private SportDao sportDao;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces="application/json")
    public AllSportEvent getAllSport() {
        return new AllSportEvent(this.sportDao.getAll());
    }
}

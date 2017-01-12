package com.terrasport.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terrasport.webservice.core.model.Terrain;
import com.terrasport.webservice.core.service.TerrainService;

@RestController
@RequestMapping("/terrain")
public class TerrainController {

	@Autowired
	private TerrainService terrainService;
	
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces="application/json")
    public List<Terrain> getAllTerrains() {
        return this.terrainService.getAll();
    }
    
    @RequestMapping(value = "/public", method = RequestMethod.GET, produces="application/json")
    public List<Terrain> getAllTerrainsPublic() {
        return this.terrainService.getAllPublic();
    }
    
    @RequestMapping(value = "/prive", method = RequestMethod.GET, produces="application/json")
    public List<Terrain> getAllTerrainsPrive() {
        return this.terrainService.getAllPrive();
    }
    
    @RequestMapping(value= "/sport/{id}", method = RequestMethod.GET, produces="application/json")
    public List<Terrain> getAllTerrainsBySport(@PathVariable("id") final Integer sportId) {
        return this.terrainService.getAllByTypeSport(sportId);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces="application/json")
    public Terrain getTerrainById(@PathVariable("id") final Integer terrainId) {
        return this.terrainService.getById(terrainId);
    }
    
    @RequestMapping(value = "/sauvegarder", method = RequestMethod.POST)
    public ResponseEntity<Void> sauvegarderTerrain(@RequestBody final Terrain terrain) {
        this.terrainService.sauvegarder(terrain);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/changer-etat", method = RequestMethod.POST)
    public ResponseEntity<Void> markTerrainAsPopulate(@RequestBody final Terrain terrain) {
        this.terrainService.changerEtat(terrain);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/supprimer/{id}", method = RequestMethod.GET)
    public ResponseEntity<Void> supprimerTerrain(@PathVariable("id") final Integer terrainId) {
        this.terrainService.supprimer(terrainId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}

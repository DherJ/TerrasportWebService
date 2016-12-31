package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.CompetenceSport;

public interface CompetenceSportDao {

	public List<CompetenceSport> getAll();
	
	public List<CompetenceSport> getByUserId(@Param("userId") final Integer userId);
	
	public void sauvegarder(@Param("competence") final CompetenceSport competence);
	
	public void supprimer(@Param("competence") final CompetenceSport competence);
}

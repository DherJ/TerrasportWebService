package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.Niveau;

public interface NiveauDao {

	public List<Niveau> getAll();
	
	public Niveau getById(@Param("niveauId") final Integer niveauId);
}

package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.Etat;

public interface EtatDao {

	public List<Etat> getAll();
	
	public Etat getById(@Param("etatId") final Integer etatId);
}

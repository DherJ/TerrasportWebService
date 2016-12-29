package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.Sexe;

public interface SexeDao {

	public List<Sexe> getAll();
	
	public Sexe getById(@Param("sexeId") final Integer sexeId);
}

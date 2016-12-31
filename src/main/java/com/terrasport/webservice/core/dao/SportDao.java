package com.terrasport.webservice.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.terrasport.webservice.core.model.Sport;

public interface SportDao {

	public List<Sport> getAll();
	
	public Sport getById(@Param("sportId") final Integer sportId);
}

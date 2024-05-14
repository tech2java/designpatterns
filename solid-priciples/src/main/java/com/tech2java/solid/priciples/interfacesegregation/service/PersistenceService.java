package com.tech2java.solid.priciples.interfacesegregation.service;

import com.tech2java.solid.priciples.interfacesegregation.entity.Entity;

import java.util.List;



//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);

	//Remove this method from here - it is being used in UserPersistenceService not in OrderPersistenceService
	//public List<T> findByName(String name);
}

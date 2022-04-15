package com.Task3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Task3.dao.*;
import com.Task3.model.*;

@Service
public class Services implements IService {

	@Autowired
	public IClothDao Dao;

	@Transactional
	public void add(Cloth cr) {
		Dao.add(cr);
		
	}

	@Transactional
	public void delete(Cloth cr) {
		Dao.delete(cr);
		
	}

	@Transactional
	public void update(Cloth cr) {
		Dao.update(cr);
	}

	@Transactional
	public List<Cloth> selection() {
		return Dao.selection();
	}
	
	
	
}

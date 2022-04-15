package com.Task3.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.Task3.model.*;
@Repository
public interface IClothDao {
	
	void add(Cloth cr);
	void delete(Cloth cr);
	void update(Cloth cr);
	List<Cloth> selection();
}
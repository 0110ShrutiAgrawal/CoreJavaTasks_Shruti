package org.edu.service;

import java.util.List;

import org.edu.model.Students;
 
public interface StudentService {
	List<Students> findAll();
	int save(Students st);
	int delete (int id);
	int update(Students st);
	Students findById(int id);

}
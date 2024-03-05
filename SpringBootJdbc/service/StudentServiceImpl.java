package org.edu.service;

import java.util.List;

import org.edu.model.Students;
import org.edu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	// connected service layer to repository layer
	@Autowired
	StudentRepository studentrepo;

	public List<Students> findAll() {
		return studentrepo.findAll();
	}

	public int save(Students st) {
		// TODO Auto-generated method stub
		return studentrepo.save(st);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return studentrepo.delete(id);
	}

	public int update(Students st) {
		// TODO Auto-generated method stub
		return studentrepo.update(st);
	}

	public Students findById(int id) {
		return studentrepo.findById(id);
	}

}

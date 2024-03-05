package com.hughes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.model.Aadhar;
import com.hughes.repository.AadharRepository;

@Service
public class AadharServiceImpl implements AadharService {

	@Autowired
	AadharRepository adRepo;
	
	public int create(Aadhar ad) {
		// TODO Auto-generated method stub
		return adRepo.create(ad);
	}

	
	public List<Aadhar> readAll() {
		// TODO Auto-generated method stub
		return adRepo.readAll();
	}

	
	public Optional <Aadhar> readById(Long id) {
		// TODO Auto-generated method stub
		return adRepo.readById(id);
	}

	
	public int update(Aadhar ad) {
		// TODO Auto-generated method stub
		return adRepo.update(ad);
	}

	public int delete(Long id) {
		// TODO Auto-generated method stub
		return adRepo.delete(id);
	}
}

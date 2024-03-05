package com.hughes.services;

import java.util.List;
import java.util.Optional;

import com.hughes.model.Aadhar;

public interface AadharService {
	public int create(Aadhar ad);
	public List<Aadhar> readAll();
	public Optional<Aadhar> readById(Long id);
	public int update(Aadhar ad);
	public int delete(Long id);
	
}

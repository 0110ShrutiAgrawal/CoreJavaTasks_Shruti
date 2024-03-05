package com.hughes.repository;

import java.util.List;
import java.util.Optional;

import com.hughes.model.Aadhar;

public interface AadharRepository {
	public int create(Aadhar ad);
	List<Aadhar> readAll();
	public Optional <Aadhar> readById(Long id);
	public int update(Aadhar ad);
	public int delete(Long id);
}

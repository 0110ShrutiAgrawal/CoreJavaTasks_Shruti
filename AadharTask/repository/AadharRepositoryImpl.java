package com.hughes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.hughes.model.Aadhar;

@Repository
public class AadharRepositoryImpl implements AadharRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int create(Aadhar ad) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into aadhar values(?,?,?,?,?,?)", ad.getAadharNo(), ad.getCitizenName(),
				ad.getMobileNo(), ad.getAddress(), ad.getIncome(), ad.getState());
	}

	public List<Aadhar> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("Select * from aadhar",
				(rs, rowNum) -> new Aadhar(rs.getLong("aadharNo"), rs.getString("citizenName"), rs.getLong("mobileNo"),
						rs.getString("address"), rs.getDouble("income"), rs.getString("state")));
	}

	public int update(Aadhar ad) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update aadhar set income=? where aadharNo=?", ad.getIncome(), ad.getAadharNo());
	}

	public int delete(Long id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from aadhar where aadharNo=?", id);
	}

	public Optional<Aadhar> readById(Long id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from aadhar where aadharNo=?", new Object[] { id },
				(rs, rowNum) -> Optional
						.of(new Aadhar(rs.getLong("aadharNo"), rs.getString("citizenName"), rs.getLong("mobileNo"),
								rs.getString("address"), rs.getDouble("income"), rs.getString("state"))));
	}

}

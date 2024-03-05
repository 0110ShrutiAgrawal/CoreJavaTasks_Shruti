package org.edu.repository;

import java.util.List;

import org.edu.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	@Autowired
	JdbcTemplate jdbctemplate;

	public List<Students> findAll() {
		return jdbctemplate.query("Select * from students",
				(rs, rowNum) -> new Students(rs.getInt("studentId"), rs.getString("studentName")));
	}

	public int save(Students st) {
		// TODO Auto-generated method stub
		return jdbctemplate.update("insert into students values(?,?,?)", st.getStudentId(), st.getStudentName(),
				st.getAge());

	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbctemplate.update("delete from students where studentId = ?", id);
	}

	public int update(Students st) {
		return jdbctemplate.update("update students set age= ? where studentId=?", st.getAge(), st.getStudentId());
	}

	public Students findById(int id) {
		return jdbctemplate.queryForObject("select * from students where studentId=?", new Object[] { id },
				(rs, rowNum) -> new Students(rs.getInt("studentId"), rs.getString("studentName"), rs.getInt("age")));
	}

}
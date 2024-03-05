package org.edu;

import org.edu.model.Students;
import org.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcExample implements CommandLineRunner {
	@Autowired
	StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcExample.class, args);
	}

	@Override
	public void run(String... args) {
		//retrieve all
		for (Students obj : studentService.findAll()) {
			System.out.println(obj.getStudentId() + " " + obj.getStudentName());
		}

		// insert operation
//		Students st = new Students();
//		st.setStudentId(111);
//		st.setStudentName("Shruti");
//		st.setAge(21);
//		System.out.println(studentService.save(st));
		
		// delete operation
//		System.out.println(studentService.delete(3));
		
		// update operation
//		st.setAge(24);
//		st.setStudentId(111);
//		System.out.println(studentService.update(st));
		

		//find by id
		Students stud = studentService.findById(111);
		System.out.println(stud.getStudentId() + " " + stud.getStudentName() + " " + stud.getAge());
	}

}
package com.trmub.SpringJDBCEX;

import com.trmub.SpringJDBCEX.model.Student;
import com.trmub.SpringJDBCEX.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcexApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setMarks(77);
		s.setName("Bilal");

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}

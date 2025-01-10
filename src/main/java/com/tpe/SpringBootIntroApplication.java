package com.tpe;

import com.tpe.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//componenscan bu classının içinde bulunduğu packegenda default olarak tarar

public class SpringBootIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntroApplication.class, args);

		/*Student student = new Student();
		student.getEmail();
		student.setName();
		*/

	}

}

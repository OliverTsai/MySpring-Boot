package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class SpringProject2023Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringProject2023Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Oliver","Fadatare","ramesh@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("David","Jadhav","sanjay@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Tony","start","tony@gmail.com");
//		studentRepository.save(student3);
//		
	}

}
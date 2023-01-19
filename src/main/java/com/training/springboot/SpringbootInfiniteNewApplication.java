package com.training.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.training.springboot.model.Course;
import com.training.springboot.model.Student;
import com.training.springboot.repository.CourseRepository;
import com.training.springboot.repository.StudentRepository;

@SpringBootApplication
public class SpringbootInfiniteNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInfiniteNewApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner oneToManyDemo(StudentRepository studRepo, CourseRepository courseRepo) {
		
		return args -> {
			
			Student student = new Student("Rohan", 24, "A+");
			
			studRepo.save(student);
			
			Course course1 = new Course("AI", 4, 25000);
			Course course2 = new Course("ML", 4, 28000);
			Course course3 = new Course("DevOps", 3, 20000);
			
			courseRepo.saveAll(Arrays.asList(course1,course2,course3));
			
			//Add courses for a student
			
			student.getCourses().addAll(Arrays.asList(course1,course2,course3));
			
			studRepo.save(student);
			
			/*
			Book book = new Book("JAVA", "Bates");
			bookRepo.save(book);
			
			pageRepo.save(new Page(1, "Introduction", book));
			pageRepo.save(new Page(34, "Collection", book));
			pageRepo.save(new Page(101, "Spring", book));
			pageRepo.save(new Page(167, "MicroServices", book));
			
		};
		
	}
		

	/*
	@Bean
	public InternalResourceViewResolver resolve() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}*/
	
	
	/*
	 * @Bean public CommandLineRunner oneToOneDemo(UserRepository userRepo,
	 * AddressRepository addRepo) {
	 * 
	 * return args -> { User user = new User("Mark", "Brown", 36, 'M'); Address
	 * address = new Address("Pune", "MH", "India", 1234); address.setUser(user); };
	 * 
	 * //user.setAddress(address); userRepo.save(user); };
	 * 
	 * }
	 */
	 
	

}

/*
 @SpringBootApplication
 
 	@Configuration
 	@EnableAutoConfiguration
 	@ComponentScan
 */ 

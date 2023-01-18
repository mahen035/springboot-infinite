package com.training.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.training.springboot.model.Book;
import com.training.springboot.model.Page;
import com.training.springboot.repository.BookRepository;
import com.training.springboot.repository.PageRepository;

@SpringBootApplication
public class SpringbootInfiniteNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInfiniteNewApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner oneToManyDemo(BookRepository bookRepo, PageRepository pageRepo) {
		
		return args -> {
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

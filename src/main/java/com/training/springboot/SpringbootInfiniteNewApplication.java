package com.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SpringbootInfiniteNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInfiniteNewApplication.class, args);
	}
	
	/*
	@Bean
	public InternalResourceViewResolver resolve() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}*/

}

/*
 @SpringBootApplication
 
 	@Configuration
 	@EnableAutoConfiguration
 	@ComponentScan
 */ 

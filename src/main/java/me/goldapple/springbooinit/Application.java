package me.goldapple.springbooinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application{

	public static void main(String[] args) {
		SpringApplication application  =new SpringApplication(Application.class);
		//application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
		//SpringApplication.run(Application.class , args);
	}

}

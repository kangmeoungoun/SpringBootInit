package me.goldapple.springbooinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application{
	public static void main(String[] args) {

		new SpringApplicationBuilder(Application.class)
				.listeners(new SampleListener())
				.web(WebApplicationType.NONE)
				.run(args);
	}
}

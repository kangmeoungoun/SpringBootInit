package me.goldapple.springbooinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class , args);
	}

	@Bean
	public WebClientCustomizer webClientCustomizer(){
		return webClientCustomizer -> webClientCustomizer.baseUrl("http://localhost:8080");
	}
	@Bean
	public RestTemplateCustomizer restTemplateCustomizer(){
		return restTemplate -> restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
	}
}

package me.goldapple.springbooinit;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;

@SpringBootApplication
public class Application{
	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(Application.class)
				.run(args);
	}
}

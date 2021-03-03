package me.goldapple.springbooinit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Duration;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/m/**")
                .addResourceLocations("classpath:/m/")
                .setCacheControl(CacheControl.maxAge(Duration.ofSeconds(10L)))
                .setUseLastModified(false);
        ;
    }
}

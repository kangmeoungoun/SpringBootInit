package me.goldapple.springbooinit;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanConfiguration.class)
public class HolomanConfiguration{

    @Bean
    public Holoman holoman(HolomanProperties properties){
        Holoman holoman = new Holoman();
        holoman.setHowLong(properties.getHowlong());
        holoman.setName(properties.getName());
        return holoman;
    }
}

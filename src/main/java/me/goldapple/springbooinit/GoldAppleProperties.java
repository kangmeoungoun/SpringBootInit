package me.goldapple.springbooinit;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("goldapple")
@Component
@Getter
@Setter
public class GoldAppleProperties{
    private String name;
    private int age;
}

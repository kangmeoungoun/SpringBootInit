package me.goldapple.springbooinit;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties("house")
public class HouseProperties{
    private String name;
    private int height;
    private int width;
}

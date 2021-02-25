package me.goldapple.springbooinit;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ConfigurationProperties("kmo")
@Component
@Validated
public class goldappleProperties{

    @NotEmpty
    private String name;
    private int age;
    private String fullName;
}

package me.goldapple.springbooinit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(properties = "kmo.age=10")
@TestPropertySource(
    locations = "classpath:templates/a.properties"
)
class ApplicationTest{
    @Autowired
    Environment environment;

    @Test
    void contextLoads(){
        String property = environment.getProperty("test");
        String age = environment.getProperty("kmo.age");
        String fullname = environment.getProperty("kmo.fullname");
        System.out.println(fullname);
        assertThat(property).isEqualTo("test");
        assertThat(age).isEqualTo("10");
    }
}
package me.goldapple.springbooinit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner{
    @Value("${kmo.name}")
    private String name;
    @Value("${kmo.age}")
    private int age;
    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println(name);
        System.out.println(age);
    }
}

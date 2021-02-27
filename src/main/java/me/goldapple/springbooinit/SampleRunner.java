package me.goldapple.springbooinit;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SampleRunner implements ApplicationRunner{

    @Autowired
    private String hello;

    @Autowired
    private GoldAppleProperties goldAppleProperties;

    @Autowired
    Environment environment;

    public void run(ApplicationArguments args) throws Exception{
        System.out.println("hello = " + hello);
        System.out.println("goldAppleProperties = " + goldAppleProperties.getName());
        System.out.println("goldAppleProperties = " + goldAppleProperties.getAge());
    }
}

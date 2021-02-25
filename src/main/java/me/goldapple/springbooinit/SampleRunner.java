package me.goldapple.springbooinit;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

@Component
@RequiredArgsConstructor
public class SampleRunner implements ApplicationRunner{

    private final goldappleProperties goldappleProperties;
    private final HouseProperties houseProperties;


    public void run(ApplicationArguments args) throws Exception{

        System.out.println(goldappleProperties.getAge());
        System.out.println(goldappleProperties.getName());
        System.out.println(goldappleProperties.getFullName());
        System.out.println(houseProperties.getName());
        System.out.println(houseProperties.getWidth());
        System.out.println(houseProperties.getHeight());

    }
}

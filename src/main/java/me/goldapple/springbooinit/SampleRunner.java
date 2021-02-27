package me.goldapple.springbooinit;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);
    @Autowired
    Environment environment;

    public void run(ApplicationArguments args) throws Exception{
        logger.info("==================================");
        logger.info("hello = " + hello);
        logger.info("goldAppleProperties = " + goldAppleProperties.getName());
    }
}

package me.goldapple.springbooinit.sample;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController{
    Logger logger = LoggerFactory.getLogger(SampleController.class);
    private final SampleService sampleService;

    @GetMapping("/hello")
    public String hello(){
        logger.info("holoman");
        System.out.println("skip");
        return "hello " + sampleService.getName();
    }
}

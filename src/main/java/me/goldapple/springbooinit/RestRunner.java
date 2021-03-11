package me.goldapple.springbooinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Component
public class RestRunner implements ApplicationRunner{
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Autowired
    private WebClient.Builder builder;
    @Override
    public void run(ApplicationArguments args) throws Exception{
        RestTemplate restTemplate = restTemplateBuilder.build();
        WebClient webClient = builder.build();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        /*  restTemplate
        //TODO hello 호출
        String helloResult = restTemplate.getForObject("http://localhost:8080/hello" , String.class);
        System.out.println("helloResult = " + helloResult);
        //TODO world 호출
        String worldResult = restTemplate.getForObject("http://localhost:8080/world" , String.class);
        System.out.println("worldResult = " + worldResult);
        */
        Mono<String> helloMono = webClient.get()
                .uri("http://localhost:8080/hello")
                .retrieve()
                .bodyToMono(String.class);
        helloMono.subscribe(s->{
            System.out.println(s);
            if(stopWatch.isRunning()){
                stopWatch.stop();
            }
            System.out.println(stopWatch.prettyPrint());
            stopWatch.start();;
        });
        Mono<String> worldMono = webClient.get()
                .uri("http://localhost:8080/world")
                .retrieve()
                .bodyToMono(String.class);
        worldMono.subscribe(s->{
            System.out.println(s);
            if(stopWatch.isRunning()){
                stopWatch.stop();
            }
            System.out.println(stopWatch.prettyPrint());
            stopWatch.start();
        });


    }
}

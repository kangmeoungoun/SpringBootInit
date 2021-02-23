#### 스프링 부트 활용
##### SpringApplication 2부

이벤트 발생 리스너 사용
이 이벤트가 언제 발생하는지가 중요  ApplicationContext 만들기 전후 에 발생하는지에 따라 등록하는 방법이 달라짐.

ApplicationContext 만들어지고난 후
```java
@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent>{
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent){
        System.out.println("=======================");
        System.out.println("Started");
        System.out.println("=======================");
    }
}

```
ApplicationContext 만들어지고난 전
```java

public class SampleListener implements ApplicationListener<ApplicationStartingEvent>{

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent){
        System.out.println("=======================");
        System.out.println("Application is Starting");
        System.out.println("=======================");
    }
}
//run 하기전 리스너 등록해준다.
@SpringBootApplication
public class Application{
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .listeners(new SampleListener())
                .run(args);
    }
}
```

아규먼트 옵션
```java
java -jar ./target/springbooinit-0.0.1-SNAPSHOT.jar -Dfoo --bar

-D : VM Options
-- program Arguments
```
![image](https://user-images.githubusercontent.com/40969203/108852320-ce7d0000-7628-11eb-9a4b-85d4d9047c51.png)



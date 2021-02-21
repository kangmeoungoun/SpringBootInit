#### 스프링 부트 원리
##### 자동 설정 만들기 2부 : @ConfigurationProperties

```java
@Bean
@ConditionalOnMissingBean
//Holoman 이라는 해당 Bean 이 없을때 등록해라.
public Holoman holoman(){
    Holoman holoman = new Holoman();
    holoman.setHowLong(5);
    holoman.setName("kmo");
    return holoman;
}

@ConfigurationProperties("holoman")
public class HolomanProperties{
    private String name;
    private int howlong;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHowlong(){
        return howlong;
    }

    public void setHowlong(int howlong){
        this.howlong = howlong;
    }
}
@Configuration
@EnableConfigurationProperties(HolomanConfiguration.class)
public class HolomanConfiguration{

    @Bean
    public Holoman holoman(HolomanProperties properties){
        Holoman holoman = new Holoman();
        holoman.setHowLong(properties.getHowlong());
        holoman.setName(properties.getName());
        return holoman;
    }
}

//사용법 
// application.properties
holoman.howlong=30
holoman.name=강명운


```

![image](https://user-images.githubusercontent.com/40969203/108619340-7ba81a80-7467-11eb-8b93-c4b184dcadbf.png)

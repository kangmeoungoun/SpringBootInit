#### 스프링 부트 활용
##### 스프링 웹 MVC 4부: 정적 리소스 지원
```java
@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/m/**")
                .addResourceLocations("classpath:/m/")
                .setCacheControl(CacheControl.maxAge(Duration.ofSeconds(10L)))
                .setUseLastModified(false);
        ;
    }
    //처음 정적페이지 조회후 새탭 열어서 20 초 전에 할시 캐시 에서 처리
```

![image](https://user-images.githubusercontent.com/40969203/109810433-dd893100-7c6c-11eb-9729-51041a9650be.png)


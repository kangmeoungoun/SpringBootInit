#### 스프링 부트 원리
##### 자동설정만들기 1부 : Starter 와 AutoConfigure 

```java
@EnableAutoConfiguration
```
spring-boot-autoconfigure-2.4.1.jar/META-INF/spring.factories 에
org.springframework.boot.autoconfigure.EnableAutoConfiguration
의 키의 값들이 autoconfiguration 의대상이된다 예네들 전부 @Configuration 어노테이션을 달고 있다.
즉 예네들을 전부 다 설정파일들이다.전부다 빈으로 등록된느것은 아니고 조건에 따라 다르다.

![image](https://user-images.githubusercontent.com/40969203/108599461-9e3d2380-73d4-11eb-8860-53cd29496b59.png)
![image](https://user-images.githubusercontent.com/40969203/108599468-a2694100-73d4-11eb-9526-fa5eb6955af4.png)

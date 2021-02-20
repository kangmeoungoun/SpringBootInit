#### 스프링 부트 원리
##### 자동 설정 이해

```java
@EnableAutoConfiguration
```
spring-boot-autoconfigure-2.4.1.jar/META-INF/spring.factories 에
org.springframework.boot.autoconfigure.EnableAutoConfiguration
의 키의 값들이 autoconfiguration 의대상이된다 예네들 전부 @Configuration 어노테이션을 달고 있다.
즉 예네들을 전부 다 설정파일들이다.전부다 빈으로 등록된느것은 아니고 조건에 따라 다르다.

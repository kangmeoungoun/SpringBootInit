#### 스프링 부트 원리
##### 의존성 관리 이해

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.4.1</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.4.1</version>
</parent>

<!--여기에 스프링 관련된 라이브러리 들 버전 명시 되어 있음 spring-boot-dependencies-->
<!--spring-boot-dependencies 여기서 지원하지 않는 의존성은 버전 명시 해야 한다. -->
```
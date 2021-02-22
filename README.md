#### 스프링 부트 활용
##### SpringApplication 1부

- Edit Configurations 에서 vm Option -Ddebug 주면 로그레벨Debug 및 자동설정 에 관련된 로그 나온다.
```java
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::   v2.4.3
```
- banner.txt 위에 처럼 나오던것 을 커스텀하게 수정할수있다.
- 이미지도 가능한데 banner*.jpg 앞에 banner 이름으로 시작해야 한다.
```properties
spring.banner.image.location=classpath:banner.jpg
spring.banner.image.width=100
spring.banner.image.height=42
spring.banner.image.margin=5
spring.banner.image.invert=0
```

```java
//배너를 끄던지 자바에서 커스텀하게 설정 가능
SpringApplication app = new SpringApplication(Application.class);
//app.setBannerMode(Banner.Mode.OFF);
app.setBanner((environment , sourceClass , out) -> out.println("-1-1-1-"));
app.run(args);

//빌더 패턴으로 실행 하는방법
new SpringApplicationBuilder()
.sources(Application.class)
.run(args);
```
![image](https://user-images.githubusercontent.com/40969203/108717033-269bff80-7560-11eb-8760-040a011e3d11.png)
![image](https://user-images.githubusercontent.com/40969203/108717047-2ac81d00-7560-11eb-941b-44f720aa5f00.png)


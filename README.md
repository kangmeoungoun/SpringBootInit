#### 스프링 부트 활용
##### 외부설정 2부(1)

```java
@Getter
@Setter
@ConfigurationProperties("kmo")
@Component
public class goldappleProperties{
    private String name;
    private int age;
    private String fullName;
}
```
```properties
kmo.name=goldapple
kmo.age=${random.int}
kmo.fullName = ${kmo.name} me

```
```java
@SpringBootApplication
@EnableConfigurationProperties(goldappleProperties.class)

EnableConfigurationProperties 예는 자동으로 스프링부트가 넣어준다. 생략 가능.
```

![image](https://user-images.githubusercontent.com/40969203/109155708-3cedc980-77b3-11eb-884b-a0e672307b03.png)

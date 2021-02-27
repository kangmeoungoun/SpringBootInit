#### 스프링 부트 활용
##### 프로파일


java -jar ./target/springbooinit-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```properties

application.properties
spring.profiles.active=test
goldapple.name=kmo
goldapple.age=19

application-pord.properties
goldapple.name=kmo prrod


## 프로파일 prod 설정
name : kmo prrod
age : 19
## 기존에 있던것들은 오바라이드

```
![image](https://user-images.githubusercontent.com/40969203/109385433-1b1d4f80-7937-11eb-9711-1e4fa13ce5ba.png)

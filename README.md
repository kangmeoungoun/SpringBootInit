#### 스프링 부트 활용
##### 스프링 데이터 2부:인메모리 데이터베이스

인메모리 DB 설정이 매번 새로운 url 로 만들어져서  아래 설정을 주면 
- jdbc:h2:mem:4fea8c2b-f00c-4870-996a-06156b3e4db3
   -> jdbc:h2:mem:testdb!!!!
        변경된다
```properties
spring.datasource.generate-unique-name=false
```

![image](https://user-images.githubusercontent.com/40969203/110239230-446a5b00-7f89-11eb-9923-04a4a1d16053.png)
![image](https://user-images.githubusercontent.com/40969203/110239235-47654b80-7f89-11eb-8c1f-0eb2cdd41885.png)

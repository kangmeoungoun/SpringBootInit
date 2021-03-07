#### 스프링 부트 활용
##### 스프링 웹 MVC 11부: CORS

- Single-Origin Policy (같은 오리진에만 요청을 보낼수 있다.)
- 기본적으로 SOP가 다 적용 ORIGIN HTTP+도메인+포트 가 하나의 오리진


- Cross-Origin Resource Sharing(서로다른 오리진끼리 리소스 공유)
    - SOP 를 우회하기 위한 표준 기술
    
- RestAPI 를 제공하는 8080 서버가  그 RestAPI 를 18080 이라는 서버가 호출한다. 호출할수 없다.

```
다른 클라이언트 서버 하나파서 18081 포트로 
ajax 호출 http://localhost:8080/hello
할때나는 에러
Access to XMLHttpRequest at 'http://localhost:8080/hello' from origin 'http://localhost:18080' has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.
```

```java

@GetMapping
@CrossOrigin(origins = "http://localhost:18080")
//붙인후 다시 18081 포트에서 호출시 성공.
```
![image](https://user-images.githubusercontent.com/40969203/110229093-4b25ad80-7f4a-11eb-8248-05e24b90b895.png)

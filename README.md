#### 스프링 부트 원리
##### 내장 웹 서버 응용 1부 : 컨테이너와 포트


```properties
server.port=0 /*포트번호 랜덤 생성*/
```
```java
@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent>{
    //webServer가 실해후 콜백 해준다.
    
    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent){
        ServletWebServerApplicationContext applicationContext = servletWebServerInitializedEvent.getApplicationContext();
        WebServer webServer = applicationContext.getWebServer();
        System.out.println(webServer.getPort());

    }
}

```
![image](https://user-images.githubusercontent.com/40969203/108622271-f464a200-747a-11eb-8926-b3e733a35737.png)

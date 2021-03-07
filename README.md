#### 스프링 부트 활용
##### 스프링 데이터 3부:MySQL

DBCP 
```java
Connection connection = dataSource.getConnection() 
//이과정이 상당히 여러가지 일들이 벌어지는 과정
//그래서 커넥션을 미리 만들어 놓는다.
//dataSource.getClass() 시 어떤 커넥션풀 사용했는지 알수 있다.

```
```dockerfile

docker run -p 3306:3306 --name mysql_boot -e MYSQL_ROOT_PASSWORD=1 -e MYSQL_DATABASE=springboot -e MYSQL_USER=keesun -e MYSQL_PASSWORD=pass -d mysql
docker exec -i -t mysql_boot bash
mysql -u goldapple -p
```

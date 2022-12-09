# Spring Boot Eğitim

- Java 11
- Spring Boot
- Spring MVC
- Spring Data
- Spring Security
- Spring Rest

## Steps
> Spring Mvc

## Reference Documentation
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/#build-image)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-features-security)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#using-boot-devtools)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [ GitHub ](https://github.com/baranbaturr01/springBootProject)

```shell
docker run -p 8080:8080 -t spring-boot-project
```

* [H2 console](http://localhost:8081/h2-console/l)
* [Swagger](http://localhost:8081/swagger-ui.html)

```shell
1.Adım
$ ./mvnw clean package -DskipTests

2.Adım
$ dcoker-compose up
$ docker ps

3.Adım
POSTMAN
//Ekleme
http://localhost:8081/api/v1/create/product

//Listele
http://localhost:8081/api/v1/list/product

//Find
http://localhost:8081/api/v1/find/product/1

//Delete
http://localhost:8081/api/v1/delete/product/1

4.Adım
$  docker exec -it spring_docker_postgresqldb_1 psql -U postgres postgres
```
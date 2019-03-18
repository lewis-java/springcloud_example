# spring cloud example
A simple spring cloud example

## modules
springcloud-config-server: config server
springcloud-discover-eureka: register center
springcloud-movie-service
springcloud-movie: mover-api application
springcloud-user-dao
springcloud-user-service
springcloud-user: user-api application
springcloud-zuul: zuul gateway

## comment
1. start up config server;
2. start up discover server, url: http://localhost:8761/
    spring security username/password: leo/leo;
3. start up movie and user application:
    can start up multiple service like: java -jar springcloud-user-1.0-SNAPSHOT.jar -Dserver.port=10000 && java -jar springcloud-user-1.0-SNAPSHOT.jar -Dserver.port=10001;
4. start up gateway;
5. test: 
    a. direct call user service: http://localhost:10001/web/api/v1/user/get/1
    b. call user service by movie service: http://localhost:10002/web/api/v2/user/get/1
    c. direct call user service by zuul: http://localhost:10006/user-api/web/api/v1/user/get/1
    d. call user service by zuul and movie service: http://localhost:10006/movie-api/web/api/v1/user/get/1
    
##sql script
springcloud-user\src\main\resources\scripts\data.sql
springcloud-user\src\main\resources\scripts\schema.sql
# Microservices
## Zuul server
http://localhost:8080/
## Configuration server
http://localhost:8081/
## Eureka server
http://localhost:8082/
## Users service
http://localhost:8083/
## OAuth2 server
http://localhost:8084/

## OAuth2 Authorization
### Request Authorization
```txt
POST /auth/oauth/token HTTP/1.1
Host: localhost:8080
Content-Type: application/x-www-form-urlencoded
Authorization: Basic YW5kcm9pZC1jbGllbnQ6YW5kcm9pZC1zZWNyZXQ=
User-Agent: PostmanRuntime/7.15.2
Accept: */*
Cache-Control: no-cache
Postman-Token: da3381af-61cd-43be-92eb-cf09be8c36e9,1a9a143d-d471-4c59-bdb0-3ab0fd702af5
Host: localhost:8080
Accept-Encoding: gzip, deflate
Content-Length: 71
Connection: keep-alive
cache-control: no-cache

grant_type=password&username=USERNAME_GOES_HERE&password=PASSWORD_GOES_HERE
```

### Check authorization
```
GET /auth/oauth/check_token?token=ACCESS_TOKEN_GOES_HERE HTTP/1.1
Host: localhost:8080
User-Agent: PostmanRuntime/7.15.2
Accept: */*
Cache-Control: no-cache
Postman-Token: 4b41fd88-cf72-4765-902c-5e4d55d8c911,79676448-1036-46e5-9373-8a26586032bb
Host: localhost:8080
Accept-Encoding: gzip, deflate
Connection: keep-alive
cache-control: no-cache
```
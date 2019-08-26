# Spring Cloud Netflix Microservices + Spring Security OAuth2
## Applications
| Service              | Port |
| -------------------- | ---- |
| Zuul                 | 8080 |
| Configuration        | 8081 |
| Eureka               | 8082 |
| OAuth2 Authorization | 8084 |
| Users microservice   | 8083 |

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
Host: localhost:8080
Accept-Encoding: gzip, deflate
Connection: keep-alive
cache-control: no-cache
```

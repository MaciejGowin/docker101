> docker build --no-cache -t spring-boot:1 .

> docker run --name app -p 8080:8080 -d spring-boot:1
> docker logs app
> docker exec -it app /bin/sh

> curl http://localhost:8080
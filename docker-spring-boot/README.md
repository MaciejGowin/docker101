Build an image called `spring-boot` with a version tag `1`.
> docker build --no-cache -t spring-boot:1 .

Run a container from previously build image in the detached mode. Expose ports.
> docker run --name app -p 8080:8080 -d spring-boot:1

Check logs of the container.
> docker logs app

Start interactive shell with execute.
> docker exec -it app /bin/sh

Check the service endpoint with curl from the inside of the container.
> curl http://localhost:8080
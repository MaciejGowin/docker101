> docker run --name db -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql:8.0
> docker start db
> docker exec -it db bash

> CREATE DATABASE customer_system
> curl --location 'http://localhost:8080/customers'
> curl --location 'http://localhost:8080/customers' --header 'Content-Type: application/json' --data '{"firstName": "Maciej", "lastName": "Gowin", "dateOfBirth": "1986-11-21", "countryCode": "pl"}'
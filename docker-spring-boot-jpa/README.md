Run the MySQL 8.0 container with exposed port.
> docker run --name db -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql:8.0

Start container if not running.
> docker start db

Execute terminal on container to get inside.
> docker exec -it db bash

Create database
> mysql -uroot -p
> CREATE DATABASE customer_system

Start and invoke the application locally.
> curl --location 'http://localhost:8080/customers'
> curl --location 'http://localhost:8080/customers' --header 'Content-Type: application/json' --data '{"firstName": "Maciej", "lastName": "Gowin", "dateOfBirth": "1986-11-21", "countryCode": "pl"}'
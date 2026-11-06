TOURIST MICROSERVICE LOAD BALANCING

Requirements: JDK 17, Eclipse with Spring Tools, internet for Maven downloads.

IMPORT:
1. Extract this ZIP.
2. Eclipse > File > Import > Maven > Existing Maven Projects.
3. Select the extracted folder and import eureka-server, tourist-service, api-gateway.
4. Wait for Maven dependencies to download.

RUN ORDER:
1. eureka-server (8761)
2. tourist-service (run twice with separate Run Configurations; random ports)
3. api-gateway (8080)

Eureka dashboard: http://localhost:8761
Postman GET: http://localhost:8080/tourists/ping
Postman POST: http://localhost:8080/tourists
POST JSON: {"name":"Thriveda","place":"Tirupati","country":"India"}

Note: Each service instance has its own in-memory H2 database. Use /tourists/ping to test load balancing.

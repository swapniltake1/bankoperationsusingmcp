# Bank Demo Application for MCP Operations

This is a **Spring Boot-based banking application** created for **Massive Computational Practice (MCP)**. The project is designed to simulate real-world banking operations using demo datasets, focusing on **transaction processing, account management, and database interaction**.

---

## Table of Contents

- [Overview](#overview)
- [Technologies](#technologies)
- [Key Functionalities](#key-functionalities)
- [Setup and Installation](#setup-and-installation)
- [Database Configuration](#database-configuration)
- [Running the Application](#running-the-application)
- [Project Structure](#project-structure)
- [Future Enhancements](#future-enhancements)
- [Author](#author)
- [License](#license)

---

## Overview

This application simulates typical banking operations to **practice MCP tasks**, including:

- Managing ATM transactions
- Customer account operations
- Querying and processing transaction history
- Handling bulk banking datasets

It is primarily intended for **practical experimentation, testing, and data operations**, rather than as a student mini-project.

---

## Technologies

- **Backend:** Java 17, Spring Boot 3.5.7, Spring Data JPA, Hibernate ORM  
- **Database:** MySQL 8.0  
- **Connection Pool:** HikariCP  
- **Build Tool:** Maven  
- **Version Control:** Git / GitHub  
- **Others:** Lombok for reducing boilerplate

---

## Key Functionalities

- Retrieve ATM transaction history with date filters  
- CRUD operations for accounts and transactions  
- Perform bulk operations on banking datasets  
- RESTful APIs for transaction processing and account management  

---

## Setup and Installation

1. **Clone the repository:**

```bash
git clone https://github.com/swapniltake1/bankoperationsusingmcp.git
cd bankoperationsusingmcp
````

2. **Set up the MySQL database:**

```sql
CREATE DATABASE bank_demo;
```

* Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bank_demo
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

3. **Build and run the application:**

```bash
mvn clean install
mvn spring-boot:run
```

4. **Access the API:**

* Base URL: `http://localhost:8080`
* Example endpoint:
  `GET /api/atm/transactions?startDate=2025-01-01T00:00:00&endDate=2025-12-31T23:59:59`

---

## Project Structure

```
bank-demo/
├── src/main/java/com/demo/bank/
│   ├── controller/       # REST Controllers
│   ├── service/          # Business logic
│   ├── repository/       # JPA Repositories
│   ├── model/            # Entity classes
│   └── DemoApplication.java
├── src/main/resources/
│   ├── application.properties
│   └── data.sql          # Optional demo data
└── pom.xml               # Maven dependencies
```

---

## Future Enhancements

* Integration with live banking datasets for stress testing
* Implement multi-threaded transaction processing
* Add detailed logging and monitoring
* Unit and integration testing for large-scale datasets

---

## Author

**Swapnil Take**
Application Developer | Java & Spring Boot | MCP Practice Projects
[GitHub](https://github.com/<your-username>) | [LinkedIn](https://www.linkedin.com/in/swapniltake)

---

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.




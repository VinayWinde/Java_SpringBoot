# 🧑‍💼 Employee Management System - Spring Boot

This is a simple **Employee Management System** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**. It allows CRUD operations (Create, Read, Update, Delete) on employee data via RESTful APIs.

---

## 🚀 Features

- Add new employee
- View all employees
- View employee by ID
- Update employee information
- Delete employee
- Exception handling
- Swagger UI for API documentation

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (or H2 for dev)
- Maven
- Swagger (SpringDoc or springfox)
- Lombok

---


---

## ⚙️ Setup Instructions

### Prerequisites
- Java 17+
- Maven
- MySQL (or Docker for DB container)

### Clone the Repository

```bash
git clone https://github.com/your-username/employee-management.git
cd employee-management
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
mvn clean install
mvn spring-boot:run



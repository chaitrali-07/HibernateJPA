# Hibernate JPA CRUD Project

## 👩‍💻 Developer Info

- **Chaitrali Diwanji**
- **Priya Telange**
---
## 📌 Project Description

This is a simple Java-based **Hibernate JPA CRUD** application. It demonstrates how to perform basic operations such as:

- Create
- Read
- Update
- Delete

The application uses **Maven** for dependency management and **PostgreSQL** as the database.
---
## 🛠️ Technologies Used

- Java
- Hibernate (JPA)
- Maven
- PostgreSQL
- Spring Tool Suite (STS) / Eclipse
---
## 🔄 Features Implemented

- Add (Create) new employee, country, and region records
- View (Read) existing entries
- Modify (Update) data in the database
- Remove (Delete) entries
---
- ## 📦 Maven Dependencies (from `pom.xml`)

```xml
<dependencies>

        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>7.0.5.Final</version>
        </dependency>
       
        <dependency>
            <groupId>jakarta.persistence</groupId>
            <artifactId>jakarta.persistence-api</artifactId>
            <version>3.1.0</version>
        </dependency>

       
        <dependency>
            <groupId>jakarta.transaction</groupId>
            <artifactId>jakarta.transaction-api</artifactId>
            <version>2.0.1</version>
        </dependency>

       
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.7.7</version>
        </dependency>
        <dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-jpamodelgen</artifactId>
    <version>7.0.5.Final</version>
</dependency>

    </dependencies>
```
---
## PostgreSQL Table SQL Scripts
```
-- Table: country
CREATE TABLE country (
    country_id SERIAL PRIMARY KEY,
    country_name VARCHAR(100),
capital VARCHAR(100)
);
CREATE TABLE region (
    region_id SERIAL PRIMARY KEY,
    region_name VARCHAR(100)
);
- Table: employee
CREATE TABLE employee (
    emp_id SERIAL PRIMARY KEY,
    emp_name VARCHAR(100),
    emp_email VARCHAR(100),
    country_id INT REFERENCES country(country_id),
    region_id INT REFERENCES region(region_id)
);
```
---
Prerequisites

Java JDK 17 or higher

Apache Maven 3.8.6 or higher

PostgreSQL 15 or higher

pgAdmin (optional for GUI)

---
📩 Contact
- Name : Chaitrali Diwanji
- GitHub : chaitrali-07
- Email : chaitrudiwanji07@gmail.com
---
## 📸 Screenshot
<img width="348" height="218" alt="Screenshot (53)" src="https://github.com/user-attachments/assets/53ac6c0a-9b4a-4c19-b062-7b699f859eaa" />


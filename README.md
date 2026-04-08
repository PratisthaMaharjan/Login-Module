# Login Module using Java Servlets (JDBC + Session Management)

## Project Overview

This project is a simple **Login Module** developed using Java Servlets and JDBC.
It demonstrates user authentication, session management, and basic QA testing concepts following the Software Testing Life Cycle (STLC).

---

## Technologies Used

* Java (Servlets)
* JDBC
* MySQL (XAMPP)
* Apache Tomcat
* Apache NetBeans
* JSP

---

## Setup Instructions

1. Start XAMPP (Apache + MySQL)
2. Import the database:

   * Open phpMyAdmin
   * Import `database.sql`
3. Add MySQL Connector/J JAR to project libraries
4. Run the project using Apache Tomcat
5. Open in browser:

   ```
   http://localhost:8080/YourProjectName/login.jsp
   ```

---

## Database Setup

Run the SQL script provided in `database.sql`.

Default credentials:

* Username: admin
* Password: admin123

---

## Dependencies

Download MySQL Connector/J from:
https://dev.mysql.com/downloads/connector/j/

Add the JAR file to your project libraries.

---

## Login Flow

1. User enters credentials in `login.jsp`
2. Request is processed by the Login Servlet
3. If valid → session is created → redirected to home page
4. If invalid → error message displayed

---

## Sample Test Scenarios

* Valid login
* Invalid credentials
* Empty input fields
* Session persistence
* Session timeout
* Logout functionality

---

## Project Structure (Simplified)

```
src/java/app/     → Servlets & DB connection
web/              → JSP pages
database.sql      → Database setup script
```

---

## Notes

This project was developed for learning purposes, focusing on:

* Java Web Development (Servlets)
* Database Integration (JDBC)
* Software Testing (STLC)

---

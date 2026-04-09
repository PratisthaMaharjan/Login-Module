# Login Module using Java Servlets (JDBC + Session Management)

## Project Overview

This project is a simple **Login Module** developed using Java Servlets and JDBC.

It demonstrates:
- User authentication  
- Session management  
- Database integration  
- Automated QA testing using Selenium and TestNG

---

## Technologies Used

### Backend & Web
- Java (Servlets)
- JSP
- JDBC
- MySQL (XAMPP)
- Apache Tomcat
- Apache NetBeans

### Testing & Automation
- Selenium WebDriver
- TestNG

---

## Setup Instructions

1. Start XAMPP (Apache + MySQL)
2. Import the database:
   - Open phpMyAdmin
   - Import `database.sql`
3. Add MySQL Connector/J JAR to project libraries
4. Deploy project on Apache Tomcat
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

## 📦 Dependencies

### 🔗 Required Libraries

- **MySQL Connector/J**  
  https://dev.mysql.com/downloads/connector/j/

- **Selenium WebDriver (Java)**  
  https://www.selenium.dev/downloads/

- **TestNG**  
  https://testng.org/

---

### Additional Required JARs (for TestNG)

If you are using TestNG without Maven, you may also need:

- **JCommander**  
  https://mvnrepository.com/artifact/com.beust/jcommander

- **SLF4J API**  
  https://mvnrepository.com/artifact/org.slf4j/slf4j-api

- **SLF4J Simple (Logger Implementation)**  
  https://mvnrepository.com/artifact/org.slf4j/slf4j-simple


All JAR files should be downloaded and added manually to your project libraries if you are not using a build tool like Maven or Gradle.

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

## Automated Testing (Selenium + TestNG)

Automated UI testing is implemented using Selenium WebDriver and TestNG.

### Test Coverage:
- Valid login  
- Invalid credentials  
- Empty input fields  

### Features:
- Multiple test cases using TestNG  
- Assertions for validation  
- Automated browser interaction  
- Test execution reports (`test-output/`)  

---

## Project Structure (Simplified)

```
src/java/app/     → Servlets & DB connection
web/              → JSP pages
src/java/test/    → Selenium, TestNG classes
database.sql      → Database setup script
```

---

## Notes

This project demonstrates:
- Java Web Development fundamentals  
- Database connectivity using JDBC  
- Session handling  
- Introduction to QA Automation (Selenium + TestNG)

---

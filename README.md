# 📄 Smart Question Paper Generator (SmartQPG)

SmartQPG is a **Spring Boot + MySQL–based web application** that automatically generates VTU-style question papers for subjects like **SEPM** and **Computer Networks (CN)**.

It supports:

- 🎓 **Internal Exam (50 Marks)**
- 🏛 **External Exam (100 Marks)**

with correct **module-wise marks distribution, randomized question selection**, and a clean print-ready format.

---

## 🚀 Features

- 📌 VTU-Style Question Paper Format  
- 📚 Internal Exam Structure:
  - Module 1 → 20 Marks  
  - Module 2 → 20 Marks  
  - Module 3 → 10 Marks  
- 🧠 External Exam Structure:
  - **5 Modules × 20 Marks = 100 Marks**
- 🧩 Format Pattern:
  - Each module contains **A, B, C** subquestions
  - Marks pattern → **7 + 8 + 5 = 20**
- 🔀 Random Set Selection (Set-1 / Set-2)
- 🖨 Print Friendly Output
- 📱 Responsive & Easy-to-Use UI

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Spring Boot (REST API), Java |
| Frontend | HTML, CSS, JavaScript |
| Database | MySQL |
| Build Tool | Maven |

---

## 📦 Installation & Setup

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/Mizbataranumm/smartqpg.git
cd smartqpg
---

### 2️⃣ Configure MySQL

Create a database named `sqpg`, then edit:

📄 `src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sqpg
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

server.port=8080
server.address=0.0.0.0
🗃️ Database Requirements

Your questions table must include the following columns:

question_id  
subject_id  
chapter_id  
question_text  
difficulty  
marks  
question_type  
subject_code  
module_no  
part  
set_no  


Minimum recommended question count per subject:

5 modules × 2 sets × 3 parts (A, B, C) = 30 questions

▶️ Running the Application

Start the Spring Boot server using:

mvn spring-boot:run


Once the application is running, open:

👉 http://localhost:8080/

Select:

Subject → Exam Type → Generate

📁 Project Structure
smartqpg/
 ├─ src/main/java/com/smartqp/smartqp/
 │   ├─ SmartqpApplication.java
 │   ├─ controller/QuestionPaperController.java
 │   ├─ service/QuestionPaperGeneratorService.java
 │   ├─ dao/QuestionDAO.java
 │   └─ model/Question.java
 │
 ├─ src/main/resources/static/index.html
 └─ src/main/resources/application.properties

🛠 Future Enhancements

🧩 Difficulty-based question selection (Easy/Medium/Hard)

🛠 Admin UI to manage questions

🧾 Export generated paper to PDF

🔐 Teacher authentication system

📚 Support for more subjects

👩‍💻 Author

Mizbataranumm

📌 Smart Question Paper Generator — Built for VTU exam automation.

# 📄 Smart Question Paper Generator (SmartQPG)

SmartQPG is a **Spring Boot + MySQL–based web application** that automatically generates VTU-style question papers for subjects like **SEPM** and **Computer Networks (CN)**.

It supports:

- 🎓 **Internal Exam (50 Marks)**
- 🏛 **External Exam (100 Marks)**

with correct **module-wise marks distribution, randomized question selection**, and a clean print-ready output.

---

## 🚀 Features

- 📌 VTU-Style Question Paper Format
- 📚 Internal Exam Distribution:
  - Module 1 → 20 Marks  
  - Module 2 → 20 Marks  
  - Module 3 → 10 Marks  
- 🧠 External Exam Format:
  - **5 Modules × 20 Marks = 100 Marks**
- 🧩 Question Format Structure:
  - Each module contains **A, B, C** sub-questions  
  - Marks pattern → **7 + 8 + 5 = 20**
- 🔀 Random Set Selection (Set-1 or Set-2)
- 🖨️ Print-Friendly Output
- 📱 Responsive & Simple UI

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

2️⃣ Configure MySQL

Create a database named sqpg, then edit:

📁 src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/sqpg
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

server.port=8080
server.address=0.0.0.0


⚠️ Never commit real database passwords in public repositories.

🗃️ Database Structure

Your questions table must include:

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


Recommended minimum:

1 Subject = 5 Modules × 2 Sets × 3 Parts (A, B, C) = 30 Questions

▶️ Run the Application
mvn spring-boot:run


Then open in browser:

👉 http://localhost:8080/

Select Subject → Exam Type → Generate.

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

🧩 Difficulty-based selection (Easy/Medium/Hard)

🛠 Admin panel to add / manage questions

🧾 Export as downloadable PDF

🔐 Authentication (Faculty Login)

📚 Add support for more subjects

👩‍💻 Author

Mizbataranumm
📌 Smart Question Paper Generator — Created for academic automation.



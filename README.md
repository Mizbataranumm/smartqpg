# Smart Question Paper Generator (SmartQPG)

SmartQPG is a Spring Boot + MySQL based web application that automatically generates VTU‑style question papers for subjects like **SEPM** and **CN**.  
It supports both **Internal (50 marks)** and **External (100 marks)** exams with proper module‑wise distribution.

---

## Features

- Generate **VTU‑style papers** for:
  - Internal exam: 50 marks (Module 1 – 20, Module 2 – 20, Module 3 – 10)
  - External exam: 100 marks (5 modules × 20 marks)
- Module‑wise question selection:
  - Each module has main questions (Q.1, Q.2, …) with sub‑parts A, B, C.
  - Marks pattern per module: **7 + 8 + 5 = 20** (or 5 + 5 = 10 for internal module 3).
- Randomized paper generation:
  - For each module, one set is picked from the question bank so every generation can be different.
- Clean, responsive UI:
  - Select subject and exam type.
  - View generated paper with total marks and question count.
  - Print‑ready layout.

---

## Tech Stack

- **Backend:** Spring Boot, Java, JDBC
- **Database:** MySQL
- **Frontend:** HTML, CSS, Vanilla JavaScript
- **Build Tool:** Maven

---

## Getting Started

### 1. Clone the repository


git clone https://github.com/Mizbataranumm/smartqpg.git
cd smartqpg

### 2. Configure MySQL

Create a database and update `application.properties`:


spring.datasource.url=jdbc:mysql://localhost:3306/sqpg
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

server.address=0.0.0.0
server.port=8080
Then open:

- `http://localhost:8080`

Choose **subject** and **exam type**, click **Generate Paper**, and the formatted question paper will be displayed with a print option.

---

Import your `questions` table with columns like:

- `question_id`, `subject_id`, `chapter_id`
- `question_text`, `difficulty`, `marks`, `question_type`
- `subject_code`, `module_no`, `part`, `set_no`

Ensure each subject has:

- 5 modules × 2 sets × 3 parts (A,B,C) = **30 questions**.

---

## Run the Application

mvn spring-boot:run

## Project Structure

- `src/main/java/com/smartqp/smartqp/`
  - `SmartqpApplication.java` – Spring Boot entry point
  - `controller/QuestionPaperController.java` – REST API `/api/papers/generate-exam-style`
  - `service/QuestionPaperGeneratorService.java` – generation logic
  - `dao/QuestionDAO.java` – DB access for questions
  - `model/Question.java` – question entity
- `src/main/resources/static/index.html` – frontend UI
- `src/main/resources/application.properties` – configuration

---

## Future Improvements

- Add more subjects and flexible mark patterns.
- Admin panel for adding/editing questions from UI.
- Difficulty‑based distribution (easy/medium/hard sliders).
- Export paper as PDF.

---

## Author

**Mizbataranumm**  
Smart Question Paper Generator – VTU exam automation project.

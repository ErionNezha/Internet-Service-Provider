# 🌐 Internet Service Provider

> A Java Swing desktop management system for an Internet Service Provider — customer & employee records, internet plan creation, complaint tracking and an admin panel, all backed by MySQL.

**🔴 Live demo:** https://erionnezha.github.io/Internet-Service-Provider/

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-007396?style=for-the-badge)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

## ✨ Modules

| File | Window | Description |
|------|--------|-------------|
| `Home.java` | Home Page | Login portal & main dashboard with live clock and date — the application entry point |
| `Admin.java` | Admin Panel | Administrator workspace with privileged system controls |
| `Customer.java` | Customer | Customer registration and full record management |
| `Employee.java` | Employee | Employee record management for ISP staff |
| `CreatePlan.java` | Create Plan | Define internet plans — names, speeds and pricing |
| `Complaint.java` | Complaint Desk | File and track customer complaints |
| `javaconnect.java` | — | MySQL connection helper wiring every screen to the `isp` database |

## 🛠️ Tech Stack

- **Java** (Swing / AWT) — desktop UI
- **JDBC** — database connectivity
- **MySQL** — `isp` database

## ▶️ How to Run

1. Create a MySQL database named `isp` and update the credentials in `javaconnect.java`.
2. Compile all sources:
   ```bash
   javac *.java
   ```
3. Launch the application:
   ```bash
   java Home
   ```

## 🖥️ Demo

Browse every module's full source code with syntax highlighting in the live demo above — no IDE required.

## 📄 License

Copyright © 2026 Erion Nezha. All rights reserved. See [LICENSE](LICENSE).

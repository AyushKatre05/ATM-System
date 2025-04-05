# 💳 Java ATM System Application

This is a basic **ATM System** built using **Java**, **Swing** for the graphical user interface, and **JDBC** to connect to a **MySQL** database. The application simulates basic banking operations such as:

- Login using Account Number and PIN
- Viewing Account Balance
- Depositing Money
- Withdrawing Money
- Viewing Transaction History (Mini Statement)

## 🛠 Technologies Used

- **Java SE** – Core logic and structure
- **Swing** – For building the GUI
- **JDBC** – For database connectivity
- **MySQL** – Backend relational database

## 🔐 Security Notes

This application is intended for **educational purposes**. It uses plaintext PINs and basic JDBC calls. In a real-world system, you'd need to:

- Use **hashed PINs/passwords** (e.g., with SHA-256 or bcrypt)
- Implement **input validation** and **prepared statements** to prevent SQL injection
- Add **session handling**, **access control**, and **logging**

> Built with Java, for learning how desktop apps can work with databases.


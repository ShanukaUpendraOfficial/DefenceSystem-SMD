# 🛡️ DefenceSystem-SMD

**DefenceSystem-SMD** is a Java-based **Defense Management System Simulation** that demonstrates how multiple defense units can be coordinated through a centralized command interface using real-time communication principles.

This project is built as an academic and architectural demonstration of **Object-Oriented Programming** and the **Observer Design Pattern** using **Java Swing**.

---

## 🚀 Project Overview

DefenceSystem-SMD simulates a centralized defense command platform that controls and communicates with multiple defense units such as:

- 🚁 Helicopters  
- 🛻 Tanks  
- 🚢 Submarines  

All units operate as a **cohesive force**, reacting instantly to commands issued by the main controller.

---

## ✨ Key Features

### 🎯 Centralized Controller
- Main command interface to broadcast messages and alerts
- Sends commands to all active defense units simultaneously

### 🧩 Unit-Specific GUIs
Each defense unit has its own control panel with specialized actions:
- **Helicopter** – Shoot, Missile
- **Tank** – Fire, Reload
- **Submarine** – Sonar, Torpedo

### 🔄 Real-Time Communication
- Implemented using the **Observer Design Pattern**
- All units instantly respond when the controller updates its state

### 🚨 Area Notifications
- Toggle area-wide alerts
- Dynamic updates based on tactical conditions

---

## 🧠 Technical Stack

| Category | Technology |
|--------|-----------|
| Language | Java (JDK 8+) |
| GUI | Java Swing |
| Design Pattern | Observer Pattern |
| Concepts | OOP (Inheritance, Polymorphism, Encapsulation) |

---

## 🗂️ Project Structure
```
src/
├── controller/ # Main Controller logic (Subject)
├── units/ # Defense Units (Observers)
│ ├── Helicopter.java
│ ├── Tank.java
│ └── Submarine.java
├── interfaces/ # Observer & Subject interfaces
└── main/ # Application entry point
```
---

## 🛠️ Getting Started

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/shanuka-upendra/DefenceSystem-SMD.git
```

### 2️⃣ Open in an IDE

Import the project into:
IntelliJ IDEA
Apache NetBeans

### 3️⃣ Run the Application
Execute:
Main.java

---

🎓 Learning Outcomes

- Practical use of the Observer Design Pattern
- Real-world simulation of event-driven systems
- GUI development with Java Swing
- Strong application of OOP principles

---

📌 Future Improvements

- Multithreading for enhanced realism
- Network-based communication
- Enhanced UI/UX styling
- Logging & analytics dashboard

---

👤 Author
Shanuka Upendra
 🔗 GitHub: shanuka-upendra

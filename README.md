1. Project Overview
DefenceSystem-SMD is a simulated defense management platform developed using Java. It provides a centralized control system to coordinate multiple defense units—such as Helicopters, Tanks, and Submarines—allowing them to act as a cohesive force through real-time communication.

2. Key Features
Centralized Controller: A main interface to broadcast messages and commands to all active units simultaneously.

Unit-Specific GUIs: Each defense unit (Helicopter, Tank, Submarine) features its own interface with specialized action buttons (e.g., Shoot, Missile, Sonar).

Real-time Communication: Built using the Observer Design Pattern, ensuring that when the main controller updates its state or sends a message, all units react instantly.

Area Notifications: Ability to toggle area-wide alerts and updates based on the tactical situation.

3. Technical Stack
Language: Java (JDK 8 or higher).

Framework: Java Swing for the Graphical User Interface (GUI).

Design Patterns: Observer Pattern for state management.

Concepts: Object-Oriented Programming (OOP) including Inheritance and Polymorphism.

4. Project Structure
Plaintext
src/
├── controller/         # Logic for the Main Controller (Subject)
├── units/               # Specific Defense Units (Observers)
│   ├── Helicopter.java
│   ├── Tank.java
│   └── Submarine.java
├── interfaces/          # Observer interface definitions
└── main/                # Application entry point
5. Getting Started
Clone the Repo:

Bash
git clone https://github.com/shanuka-upendra/DefenceSystem-SMD.git
Open in IDE: Import the project into IntelliJ IDEA or Apache NetBeans.

Run: Execute the Main.java file to launch the simulation.

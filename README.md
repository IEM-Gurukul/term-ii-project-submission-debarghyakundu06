[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Library Management System
---

## Problem Statement (max 150 words)
The Library Management System is designed to manage and organize books in a library efficiently. It allows users to add books, issue books to members, and return them while maintaining proper records. The system ensures that a book cannot be issued if it is already issued and prevents invalid operations using exception handling. This project demonstrates core Object-Oriented Programming (OOP) concepts and provides a simple console-based interface for managing library operations.
---

## Target User
- Librarians  
- Students  
- Educational Institutions 
---

## Core Features
- Add new books to the library  
- Display all available books  
- Issue a book to a member  
- Return a book  
- Error handling using custom exceptions  

---

## OOP Concepts Used

- **Abstraction:** Implemented using classes like Library and Member  
- **Inheritance:** StudentMember extends Member  
- **Polymorphism:** Method overriding in subclasses  
- **Exception Handling:** Custom exception (LibraryException)  
- **Collections:** ArrayList used to store books  
---

## Proposed Architecture Description
The system is based on a modular OOP design. The Book class stores book details, the Library class manages book operations, and the Member class represents users. StudentMember extends Member to demonstrate inheritance. The Main class acts as the entry point, connecting all components. Exception handling ensures robustness by preventing invalid operations.

---

## How to Run
1. Open project in VS Code  
2. Compile all Java files  
3. Run `Main.java`  
4. View output in terminal  
---

## Git Discipline Notes
- Minimum 10 meaningful commits required.
- Separate commits for each feature (Book, Library, Member, Exception, etc.)  
- Proper commit messages used 

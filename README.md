# ATM Interface (Java)

## 📌 Project Overview

The **ATM Interface** is a Java console-based application that simulates the basic functions of an Automated Teller Machine (ATM).
Users must log in using a **User ID and PIN**, after which they can perform various banking operations such as checking transaction history, withdrawing money, depositing money, transferring funds, and quitting the system.

This project was developed as part of the **Oasis Infobyte Java Development Internship**.

---

## 🎯 Objectives

The goal of this project is to understand:

* Java programming fundamentals
* Object-Oriented Programming (OOP)
* User input handling
* Transaction processing logic
* Basic banking system simulation

---

## ⚙️ Features

### 1. User Authentication

* Users must enter a valid **User ID** and **PIN** to access the ATM system.

### 2. Transaction History

* Displays the list of previous transactions performed by the user.

### 3. Withdraw

* Allows the user to withdraw money from their account.
* Ensures sufficient balance before withdrawal.

### 4. Deposit

* Allows the user to deposit money into their account.
* Updates the account balance.

### 5. Transfer

* Allows transferring money to another account.
* Updates balance and records the transaction.

### 6. Quit

* Allows the user to exit the ATM system safely.

---

## 🛠 Technologies Used

* **Java**
* **Java Collections (ArrayList)**
* **Scanner Class for user input**
* **Console-based interface**

---

## 📂 Project Structure

ATM-Interface
│
├── ATMInterface.java
├── UserAccount.java
├── ATMOperations.java
└── README.md

---

## ▶️ How to Run the Project

### Step 1: Compile the Java files

```bash
javac ATMInterface.java
```

### Step 2: Run the program

```bash
java ATMInterface
```

---

## 🔐 Example Login

User ID: nandhini
PIN: 1234

Initial Balance: 10000

---

## 💻 Example Menu

1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit

Users can select the desired operation by entering the corresponding number.

---

## 🚀 Future Enhancements

* Add **database integration (MySQL)** for storing account details
* Implement **GUI using Java Swing**
* Add **multiple user accounts**
* Add **PIN change option**
* Implement **transaction limits**

---

## 👩‍💻 Author

**Nandhini Patel**
Java Development Intern
Oasis Infobyte

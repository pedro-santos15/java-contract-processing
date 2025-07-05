# Contract Processing with Interfaces (Java)

This is a **Java exercise project** developed following the **Interfaces section of Professor Nelio Alves' Java course on Udemy**.

It consists of a simple, clean implementation demonstrating:

✅ Use of **interfaces and dependency injection** (PaypalService implementing OnlinePaymentService)\
✅ **Object-oriented design** with clear separation of concerns\
✅ Processing of a **contract** by generating its installments, including **monthly interest and payment fees**\
✅ Application of **Date and Time API (LocalDate, DateTimeFormatter)**\
✅ Simple user interaction for data input and output

---

## 📌 Project Objective

> **"A company wants to automate its contract processing, generating installments with monthly interest and payment fees (Paypal: 1% monthly interest, 2% payment fee) for a given number of months, displaying each installment with due date and amount."**

---

## 🛠️ How It Works

1. User inputs:

   - Contract number
   - Contract date (dd/MM/yyyy)
   - Total contract value
   - Number of months for installment

2. The system processes the contract:

   - Splits total value equally among months
   - Adds 1% simple interest per month (Paypal)
   - Adds 2% payment fee per installment (Paypal)
   - Generates installments with calculated due dates and amounts

3. The program outputs:

   - A list of installments with due dates and formatted amounts.

---

## 🗂️ Project Structure

```
project_root/
├── application/
│   └── Program.java
│
├── model/
│   ├── entities/
│   │   ├── Contract.java
│   │   └── Installment.java
│   │
│   └── services/
│       ├── ContractService.java
│       ├── OnlinePaymentService.java
│       └── PaypalService.java
│
└── README.md
```

---

## 💻 How to Run

1️⃣ Clone the repository:

```bash
git clone https://github.com/yourusername/interfaces-contract-processing.git
```

2️⃣ Compile the project:

```bash
javac application/Program.java
```

3️⃣ Run the project:

```bash
java application.Program
```

---

## ✨ What I Practiced Here

✅ Interface creation and use in a practical scenario\
✅ Layered architecture with clear separation (entities, services, application)\
✅ Simple interest and fee calculation logic\
✅ Clean input and output handling\
✅ Good coding practices for readability and organization


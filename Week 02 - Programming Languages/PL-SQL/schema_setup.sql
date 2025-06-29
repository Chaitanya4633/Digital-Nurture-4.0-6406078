-- CREATING TABLES

CREATE TABLE Customers(
    CustomerId NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE
);

CREATE TABLE Accounts(
    AccountId NUMBER PRIMARY KEY,
    CustomerId NUMBER,
    AccountType VARCHAR(20),
    Balance NUMBER,
    LastModified DATE,
    FOREIGN KEY (CustomerId) References Customers(CustomerID)
);

CREATE TABLE Transactions(
    TransactionId NUMBER PRIMARY KEY,
    AccountId NUMBER,
    TransactionDate DATE,
    Amount NUMBER,
    TransactionType VARCHAR2(10),
    FOREIGN KEY(AccountId) REFERENCES Accounts(AccountId)
);

CREATE TABLE Loans(
    LoanId NUMBER PRIMARY KEY,
    CustomerId NUMBER,
    LoanAmount NUMBER,
    IntrestRate NUMBER,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY(CustomerId) REFERENCES Customers(CustomerId)
);

CREATe TABLE Employees(
    EMployeeId NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER,
    Department VARCHAR2(50),
    HireDate DATE
);
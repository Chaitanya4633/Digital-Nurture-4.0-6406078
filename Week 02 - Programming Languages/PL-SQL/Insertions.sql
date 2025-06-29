- INSERTING DATA INTO TABLES

-- INSERTING INTO CUSTOMERS TABLE

INSERT INTO CUSTOMERS(CUSTOMERID,Name,DOB,Balance,LastModified) VALUES
(1, 'John Doe', TO_DATE('1985-05-15', 'YYYY-MM-DD'), 1000, SYSDATE),
(2, 'Jane Smith', TO_DATE('1990-07-20', 'YYYY-MM-DD'), 1500, SYSDATE);

INSERT INTO CUSTOMERS(CUSTOMERID,Name,DOB,Balance,LastModified) VALUES
(3,'Chaitanya Pyla',TO_DATE('1947-07-15', 'YYYY-MM-DD'), 150000, SYSDATE),
(4, 'Virat Kohli', TO_DATE('1918-08-18', 'YYYY-MM-DD'), 181818, SYSDATE),
(5,'MS Dhoni',TO_DATE('1907-07-07', 'YYYY-MM-DD'), 777777, SYSDATE);


-- ISERTING INTO ACCOUNTS TABLE 

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified) VALUES
(1, 1, 'Savings', 1000, SYSDATE),
(2, 2, 'Checking', 1500, SYSDATE);

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified) VALUES
(3,3,'Chaitanya Pyla',150000,SYSDATE),
(4,4,'Virat Kohli',181818,SYSDATE),
(5,5,'MS Dhoni',777777,SYSDATE);

-- INSERT INTO TRANSACTIONS TABLE

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType) VALUES
(1, 1, SYSDATE, 200, 'Deposit'),
(2, 2, SYSDATE, 300, 'Withdrawal');

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType) VALUES
(4,4,SYSDATE,300,'Deposit'),
(3,3,SYSDATE,1500,'Deposit');

-- INSERTING INTO LOANS TABLE

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, IntrestRate, StartDate, EndDate)
VALUES (1, 1, 5000, 5, SYSDATE, ADD_MONTHS(SYSDATE, 60));

-- Loans for senior customers

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, IntrestRate, StartDate, EndDate) VALUES
(2, 3, 100000, 6.5, SYSDATE, ADD_MONTHS(SYSDATE, 24)),
(3, 4, 200000, 7.0, SYSDATE, ADD_MONTHS(SYSDATE, 36)),
(4, 5, 300000, 8.0, SYSDATE, ADD_MONTHS(SYSDATE, 48));

-- INSERTING INTO EMPLOYEES TABLE

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate) VALUES 
(1, 'Alice Johnson', 'Manager', 70000, 'HR', TO_DATE('2015-06-15', 'YYYY-MM-DD')),
(2, 'Bob Brown', 'Developer', 60000, 'IT', TO_DATE('2017-03-20', 'YYYY-MM-DD'));


/*
    As the given data do not meet certain conditions. So, In addition to the given data i also used dummy data
*/

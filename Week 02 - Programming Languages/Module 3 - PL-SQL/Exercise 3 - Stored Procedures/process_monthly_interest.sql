
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc IN ( SELECT AccountID, Balance  FROM Accounts WHERE AccountType = 'Savings' )  LOOP
          UPDATE Accounts
         SET Balance = Balance + (acc.Balance * 0.01), LastModified = SYSDATE
        WHERE AccountID = acc.AccountID;
  DBMS_OUTPUT.PUT_LINE('Updated AccountID: ' || acc.AccountID ||' New Balance: ' || TO_CHAR(acc.Balance * 1.01));
    END LOOP;
END;

SET SERVEROUTPUT ON;
EXEC ProcessMonthlyInterest;


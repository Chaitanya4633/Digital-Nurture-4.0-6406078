CREATE OR REPLACE PROCEDURE TransferFunds( from_account IN NUMBER,to_account IN NUMBER,
      amount IN NUMBER ) IS from_balance NUMBER;
BEGIN
    
    SELECT Balance INTO from_balance FROM Accounts WHERE AccountID = from_account;

    IF from_balance < amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in AccountID: ' || from_account);
        RETURN;
    END IF;

    UPDATE Accounts
    SET Balance = Balance - amount, LastModified = SYSDATE
    WHERE AccountID = from_account;

    UPDATE Accounts
    SET Balance = Balance + amount, LastModified = SYSDATE
    WHERE AccountID = to_account;

    DBMS_OUTPUT.PUT_LINE('Transferred ' || amount || ' from AccountID ' || from_account || 
                         ' to AccountID ' || to_account);
END;
/

SET SERVEROUTPUT ON;
EXEC TransferFunds(1, 2, 100);  


SELECT * FROM Accounts;


-- Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.

/*
    o	Question: Write a PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer
*/

SET SERVEROUTPUT ON;

BEGIN
    FOR loan_rec IN 
    (
        SELECT l.LoanId, l.CustomerId, l.EndDate, c.Name
        FROM Loans l
        JOIN Customers c ON l.CustomerId = c.CustomerId
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) 
    LOOP 

        DBMS_OUTPUT.PUT_LINE('Reminder: Hello Sir ' || loan_rec.Name || ', your loan (ID: ' || loan_rec.LoanId |') is due on ' || TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY') || '.');
        
    END LOOP;
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error Occurred: ' || SQLERRM);
END;
/

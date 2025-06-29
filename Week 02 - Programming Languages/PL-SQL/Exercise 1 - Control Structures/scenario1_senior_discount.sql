-- Scenario 1

/*
    Write a PL/SQL block that loops through all customers, checks their age, and if they are above 60, 
    apply a 1% discount to their current loan interest rates.

    No ones age is above 60 ( John Doe→born in 1985 → age=40 and Jane Smith → born in 1990 → age=35 )
    ADDING Dummy data

*/

SELECT * FROM LOANS;

DECLARE

BEGIN

    FOR cust IN ( SELECT * FROM Customers ) LOOP

        IF TRUNC(MONTHS_BETWEEN(SYSDATE, cust.DOB)/12)>60 THEN
            UPDATE LOANS
            SET IntrestRate=IntrestRate-( IntrestRate*0.01)
            WHERE CustomerId=cust.CustomerId;
        END IF;

    END LOOP;

EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(' An Error Occured : ' ||SQLERRM);

END;
/

SELECT * FROM LOANS;
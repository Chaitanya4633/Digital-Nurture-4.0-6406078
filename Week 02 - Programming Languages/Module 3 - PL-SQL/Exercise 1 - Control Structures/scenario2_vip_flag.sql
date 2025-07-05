-- SCENARIO 2 :-  A customer can be promoted to VIP status based on their balance.
/*
    Question: Write a PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000.

*/

SELECT * FROM Customers;

ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

SELECT * FROM Customers;

DECLARE

BEGIN
        FOR cust IN(SELECT * FROM Customers) LOOP
            IF cust.Balance>10000 THEN
                UPDATE Customers
                SET IsVIP='TRUE'
                WHERE CustomerId=cust.CustomerId;
            ELSE
                UPDATE Customers
                SET IsVIP='FALSE'
                WHERE CustomerId=cust.CustomerId;
            END IF;
        END LOOP;

EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUtPUT.PUT_LINE(' Error Occoured Bro: ' ||SQLERRM);
END;
/

SELECT * FROM Customers
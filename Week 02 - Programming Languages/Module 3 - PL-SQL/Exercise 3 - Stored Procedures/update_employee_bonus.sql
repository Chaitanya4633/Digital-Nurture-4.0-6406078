CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus( dept_name IN VARCHAR2, bonus_percent IN NUMBER)  IS
BEGIN
    FOR emp_rec IN (  SELECT EmployeeID, Salary  FROM Employees  WHERE Department = dept_name ) LOOP
              UPDATE Employees
              SET Salary = Salary + (emp_rec.Salary * bonus_percent / 100)
              WHERE EmployeeID = emp_rec.EmployeeID;
DBMS_OUTPUT.PUT_LINE('Updated EmployeeID: ' || emp_rec.EmployeeID ||  ' New Salary: ' ||                                      TO_CHAR(emp_rec.Salary * (1 + bonus_percent / 100)));
    END LOOP;
END;
/

SET SERVEROUTPUT ON;
EXEC UpdateEmployeeBonus('IT', 10);  


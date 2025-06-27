SET SERVEROUTPUT ON;

DECLARE
    CURSOR c_customers IS
        SELECT CustomerID, DOB FROM Customers;
    v_age NUMBER;
    v_today DATE := SYSDATE;
BEGIN
    FOR cust_rec IN c_customers LOOP
        v_age := MONTHS_BETWEEN(v_today, cust_rec.DOB) / 12;
        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Interest rate updated for CustomerID: ' || cust_rec.CustomerID || ', Age: ' || ROUND(v_age));
        END IF;
    END LOOP;
    COMMIT;
END;
/

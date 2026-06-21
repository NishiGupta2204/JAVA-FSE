
/*====================================================
  Scenario 1 :
  Apply 1% discount to loan interest rates for
  customers above 60 years of age
====================================================*/

DECLARE
    v_age NUMBER;
BEGIN
    FOR customer_rec IN (
        SELECT c.CustomerID,
               c.DOB,
               l.LoanID
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP
        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, customer_rec.DOB) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = customer_rec.LoanID;
        END IF;

    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Interest rates updated for senior citizens.');

    COMMIT;
END;
/
-------------------------------------------------------------------



/*====================================================
  Scenario 2 :
  Set VIP status for customers having balance > 10000
====================================================*/

ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);

DECLARE
BEGIN
    FOR customer_rec IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF customer_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = customer_rec.CustomerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 'FALSE'
            WHERE CustomerID = customer_rec.CustomerID;
        END IF;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('VIP status assigned successfully.');

    COMMIT;
END;
/
-------------------------------------------------------------------



/*====================================================
  Scenario 3 :
  Print reminder messages for loans due
  within the next 30 days
====================================================*/

DECLARE
BEGIN
    FOR loan_rec IN (
        SELECT c.Name,
               l.LoanID,
               l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder for ' ||
            loan_rec.Name ||
            ': Loan ID ' ||
            loan_rec.LoanID ||
            ' is due on ' ||
            TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/
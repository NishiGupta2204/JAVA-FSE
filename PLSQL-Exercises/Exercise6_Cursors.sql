/*====================================================
  Scenario 1 :
  Generate Monthly Statements
====================================================*/

DECLARE
    CURSOR GenerateMonthlyStatements IS
        SELECT TransactionID,
               AccountID,
               Amount,
               TransactionType,
               TransactionDate
        FROM Transactions
        WHERE EXTRACT(MONTH FROM TransactionDate) =
              EXTRACT(MONTH FROM SYSDATE)
        AND EXTRACT(YEAR FROM TransactionDate) =
            EXTRACT(YEAR FROM SYSDATE);

    v_transaction_id Transactions.TransactionID%TYPE;
    v_account_id Transactions.AccountID%TYPE;
    v_amount Transactions.Amount%TYPE;
    v_type Transactions.TransactionType%TYPE;
    v_date Transactions.TransactionDate%TYPE;

BEGIN
    OPEN GenerateMonthlyStatements;

    LOOP
        FETCH GenerateMonthlyStatements
        INTO v_transaction_id, v_account_id,
             v_amount, v_type, v_date;

        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(
            'Account ID : ' || v_account_id ||
            ', Amount : ' || v_amount ||
            ', Type : ' || v_type
        );

    END LOOP;

    CLOSE GenerateMonthlyStatements;
END;
/
-------------------------------------------------------------------


/*====================================================
  Scenario 2 :
  Apply Annual Maintenance Fee
====================================================*/

DECLARE
    CURSOR ApplyAnnualFee IS
        SELECT AccountID, Balance
        FROM Accounts;

    v_account_id Accounts.AccountID%TYPE;
    v_balance Accounts.Balance%TYPE;

BEGIN
    OPEN ApplyAnnualFee;

    LOOP
        FETCH ApplyAnnualFee
        INTO v_account_id, v_balance;

        EXIT WHEN ApplyAnnualFee%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - 500
        WHERE AccountID = v_account_id;

    END LOOP;

    CLOSE ApplyAnnualFee;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Annual maintenance fee applied.');

END;
/
-------------------------------------------------------------------


/*====================================================
  Scenario 3 :
  Update Loan Interest Rates
====================================================*/

DECLARE
    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID, InterestRate
        FROM Loans;

    v_loan_id Loans.LoanID%TYPE;
    v_interest_rate Loans.InterestRate%TYPE;

BEGIN
    OPEN UpdateLoanInterestRates;

    LOOP
        FETCH UpdateLoanInterestRates
        INTO v_loan_id, v_interest_rate;

        EXIT WHEN UpdateLoanInterestRates%NOTFOUND;

        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE LoanID = v_loan_id;

    END LOOP;

    CLOSE UpdateLoanInterestRates;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rates updated successfully.');

END;
/
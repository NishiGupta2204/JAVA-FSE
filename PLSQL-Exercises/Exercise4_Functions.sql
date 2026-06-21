/*====================================================
  Scenario 1 :
  Calculate Age of Customer
====================================================*/

CREATE OR REPLACE FUNCTION CalculateAge(
    p_dob IN DATE
)
RETURN NUMBER
IS
    v_age NUMBER;
BEGIN
    v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, p_dob) / 12);

    RETURN v_age;
END;
/
-------------------------------------------------------------------


/*====================================================
  Scenario 2 :
  Calculate Monthly Installment
====================================================*/

CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount IN NUMBER,
    p_interest_rate IN NUMBER,
    p_duration_years IN NUMBER
)
RETURN NUMBER
IS
    v_monthly_installment NUMBER;
    v_total_amount NUMBER;
BEGIN
    v_total_amount := p_loan_amount +
                      (p_loan_amount * p_interest_rate * p_duration_years / 100);

    v_monthly_installment := v_total_amount / (p_duration_years * 12);

    RETURN ROUND(v_monthly_installment, 2);
END;
/
-------------------------------------------------------------------


/*====================================================
  Scenario 3 :
  Check Sufficient Balance
====================================================*/

CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_account_id IN NUMBER,
    p_amount IN NUMBER
)
RETURN BOOLEAN
IS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_account_id;

    IF v_balance >= p_amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;
END;
/
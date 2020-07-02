CREATE TABLE payment
( payment_no int NOT NULL,
  empno int NOT NULL,
  payment_date char(50) NOT NULL,
  description char(50) NOT NULL,
  amount int,
  CONSTRAINT payment_pk PRIMARY KEY (payment_no)
);
 
INSERT INTO payment
(payment_no, empno, payment_date, description, amount)
VALUES
(10, '101', '28/06/2020', "Salary payment", 90000);

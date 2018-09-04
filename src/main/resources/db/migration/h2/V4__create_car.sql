CREATE TABLE CAR (
  ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
  REGISTRATION_NUMBER VARCHAR(255),
  COMPANY_ID BIGINT,
  PRIMARY KEY (ID)
);

ALTER TABLE CAR ADD CONSTRAINT CAR_COMPANY FOREIGN KEY (COMPANY_ID) REFERENCES COMPANY;
CREATE TABLE COMPANY (
  ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
  NAME VARCHAR(255),
  PRIMARY KEY (ID),
  UNIQUE KEY COMPANY_NAME (NAME)
);

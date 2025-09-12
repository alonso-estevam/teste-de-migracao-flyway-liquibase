--liquibase formatted sql
--changeset alonso.estevam:0001 splitStatements:true endDelimiter:;

CREATE TABLE tb_time
 (
     id                  NUMERIC(10, 0) NOT NULL IDENTITY (1,1),
     nome                VARCHAR(50)    NOT NULL UNIQUE,
     tecnico             VARCHAR(50)    NULL,
     localidade          VARCHAR(50)    NULL,
     CONSTRAINT PK_TIME  PRIMARY KEY (id)
 );
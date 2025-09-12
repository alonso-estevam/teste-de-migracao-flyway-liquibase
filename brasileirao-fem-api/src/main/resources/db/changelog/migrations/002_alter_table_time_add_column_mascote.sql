--liquibase formatted sql
--changeset alonso.estevam:0002 splitStatements:true endDelimiter:;

ALTER TABLE tb_time
    ADD mascote VARCHAR(30) NULL;
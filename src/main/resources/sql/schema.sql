CREATE DATABASE student_rest_api;

CREATE TABLE student (
id UUID PRIMARY KEY,
name VARCHAR(65) NOT NULL UNIQUE,
age INTEGER NOT NULL,
field_of_study VARCHAR(45) NOT NULL
);
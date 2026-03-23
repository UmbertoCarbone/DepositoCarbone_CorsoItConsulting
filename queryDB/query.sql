/* Selezioni tutto da db.tabella */
SELECT * FROM world.country

/* Seleziona tabella da db.tabella */
SELECT continent FROM world.country

/*  CREA TABELLA  + colonne */
CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    -- Altri attributi
)
/*  */
create table enrollments (
    enrollmentID INT PRIMARY KEY,
    studentID int,
    courseID int,
    grade varchar(2),
    foreign key (studentID) references students (studentID),
    Foreign Key (courseID) REFERENCES courses (courseID),
)

/* crea DB */
create databse database nomedb

/* elimina dp */
drop database nomedb

/* inserire dati in tabella */
INSERT INTO utenti
values(
    1,"tommaso","muraca","via roma",
    2,"umberto","carbone","via torino",
    3,"giovanna","verdi","via milano",
)
/* ci permette di eliminare la tabella */
DROP TABLE table_name
/* elmina il contenutoi della tebella senza eliminare la struttura */
truncate table table_name

-- Aggiungi una colonna "email" di tipo VARCHAR(100) alla tabella "utenti"
ALTER TABLE utenti
ADD email VARCHAR(100);


-- Aggiungi una colonna a una tabella esistente
ALTER TABLE table_name
ADD column_name datatype;

-- Esempio di creazione tabella con vincolo UNIQUE
CREATE TABLE Persons (
    ID int NOT NULL,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    UNIQUE (ID) -- Vincolo: la colonna ID deve essere unica
);

-- Vincolo UNIQUE su più colonne (ID e LastName insieme devono essere unici)
CONSTRAINT ctnt_name UNIQUE (ID, LastName);

-- Per eliminare un vincolo UNIQUE (index)
ALTER TABLE table_name
DROP INDEX ctnt_name;
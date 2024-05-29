CREATE TABLE employee
(
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(255) NOT NULL,
    idnumber     DOUBLE       NOT NULL,
    adress        VARCHAR(255) NOT NULL,
    dateofbirth DATE         NOT NULL,
    mail          VARCHAR(255) NOT NULL,
    phonenumber  INT          NOT NULL,
    job           VARCHAR(255) NOT NULL,
    salary        DOUBLE       NOT NULL,
    dateofstart DATE         NOT NULL,
    dateofend   DATE         NOT NULL,
    observation   VARCHAR(255) NOT NULL
);

CREATE TABLE applicant
(
    id                BIGINT AUTO_INCREMENT PRIMARY KEY,
    name              VARCHAR(255) NOT NULL,
    idnumber         DOUBLE       NOT NULL,
    adress            VARCHAR(255) NOT NULL,
    dateofbirth     DATE         NOT NULL,
    mail              VARCHAR(255) NOT NULL,
    phonenumber      INT          NOT NULL,
    domain            VARCHAR(255) NOT NULL,
    evaluation        DOUBLE       NOT NULL,
    dateofinterview DATE         NOT NULL,
    observation       VARCHAR(255) NOT NULL
);

-- Insertion of dummy data for the 'employee' table
INSERT INTO employee (name, idnumber, adress, dateofbirth, mail, phonenumber, job, salary, dateofstart,
                      dateofend, observation)
VALUES ('John Doe', 1234567890, '123 Main St', '1980-01-01', 'john.doe@example.com', 1234567890, 'Software Engineer',
        70000, '2020-01-01', '2023-01-01', 'Great worker'),
       ('Jane Smith', 2345678901, '456 Oak St', '1985-02-02', 'jane.smith@example.com', 2345678901,
        'Project Manager', 85000, '2019-02-02', '2023-02-02', 'Excellent manager'),
       ('Robert Johnson', 3456789012, '789 Pine St', '1990-03-03', 'robert.johnson@example.com', 3456789012,
        'Data Analyst', 75000, '2018-03-03', '2023-03-03', 'Skilled analyst'),
       ('Emily Davis', 4567890123, '012 Elm St', '1995-04-04', 'emily.davis@example.com', 4567890123, 'UX Designer',
        65000, '2017-04-04', '2023-04-04', 'Creative designer'),
       ('Michael Brown', 5678901234, '345 Maple St', '2000-05-05', 'michael.brown@example.com', 5678901234,
        'DevOps Engineer', 80000, '2016-05-05', '2023-05-05', 'Efficient engineer');

-- Insertion of dummy data for the 'applicant' table
INSERT INTO applicant (name, idnumber, adress, dateofbirth, mail, phonenumber, domain, evaluation,
                       dateofinterview, observation)
VALUES ('Alice Williams', 1234567890, '123 Main St', '1990-01-01', 'alice.williams@example.com', 1234567890,
        'Software Engineering', 85.5, '2022-01-01', 'Good candidate'),
       ('Bob Martin', 2345678901, '456 Oak St', '1995-02-02', 'bob.martin@example.com', 2345678901, 'Data Analysis',
        90.0, '2022-02-02', 'Excellent skills'),
       ('Charlie Davis', 3456789012, '789 Pine St', '2000-03-03', 'charlie.davis@example.com', 3456789012,
        'UX Design', 88.0, '2022-03-03', 'Creative thinker'),
       ('David Thompson', 4567890123, '012 Elm St', '1985-04-04', 'david.thompson@example.com', 4567890123,
        'Project Management', 92.5, '2022-04-04', 'Great leadership'),
       ('Eva Johnson', 5678901234, '345 Maple St', '1980-05-05', 'eva.johnson@example.com', 5678901234, 'DevOps',
        89.0, '2022-05-05', 'Efficient and reliable');
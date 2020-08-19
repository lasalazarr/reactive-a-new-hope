DROP TABLE IF EXISTS customer;

CREATE TABLE customer
        (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR2(255) NOT NULL,
        score INT NOT NULL
        );
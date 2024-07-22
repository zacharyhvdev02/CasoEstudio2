CREATE DATABASE ilib;

USE ilib;

CREATE TABLE books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    date VARCHAR(50),
    author VARCHAR(255),
    category VARCHAR(255),
    edit VARCHAR(255),
    lang VARCHAR(50),
    pages VARCHAR(50),
    description TEXT,
    ejemplares VARCHAR(50),
    stock INT,
    available INT,
    state INT,
    created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    comments TEXT
);

CREATE TABLE lendings (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    book_id INT NOT NULL,
    date_out VARCHAR(255) NOT NULL,
    date_return VARCHAR(255) DEFAULT NULL
)

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    last_name_p VARCHAR(30) NOT NULL,
    last_name_m VARCHAR(30) NOT NULL,
    domicilio VARCHAR(250) DEFAULT NULL,
    tel VARCHAR(25) DEFAULT NULL,
    sanctions INT DEFAULT '0',
    sanc_money INT NOT NULL DEFAULT '0',
    username VARCHAR(30) NOT NULL,
    password VARCHAR(255) NOT NULL
)

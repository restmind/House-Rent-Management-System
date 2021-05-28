CREATE SCHEMA IF NOT EXISTS house_rent;
USE
house_rent;

CREATE TABLE house_rent.user
(
    name     VARCHAR(45) NOT NULL,
    username VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    PRIMARY KEY (`username`)
);

CREATE TABLE house_rent.house_rent
(
    house_number     INT         NOT NULL,
    floor            VARCHAR(45) NOT NULL,
    apartment_number VARCHAR(45) NOT NULL,
    tentant_name     VARCHAR(45) NOT NULL,
    contact          VARCHAR(45) NOT NULL,
    rent_price       INT         NOT NULL,
    status           VARCHAR(45) NOT NULL,
    PRIMARY KEY (`house_number`, `apartment_number`)
);

CREATE TABLE house_rent.house_sell
(
    house_number     INT         NOT NULL,
    floor            VARCHAR(45) NOT NULL,
    apartment_number VARCHAR(45) NOT NULL,
    tentant_name     VARCHAR(45) NOT NULL,
    contact          VARCHAR(45) NOT NULL,
    rent_price       INT         NOT NULL,
    status           VARCHAR(45) NOT NULL,
    PRIMARY KEY (`house_number`, `apartment_number`)
);

CREATE TABLE house_rent.rent
(
    house_number     INT         NOT NULL,
    floor            VARCHAR(45) NOT NULL,
    apartment_number VARCHAR(45) NOT NULL,
    date_from        VARCHAR(45) NOT NULL,
    date_to          VARCHAR(45) NOT NULL,
    PRIMARY KEY (`house_number`, `apartment_number`)
);
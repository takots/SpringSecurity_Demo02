CREATE TABLE user (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO user (name, age) VALUES
('Alice Johnson', 28),
('Alice Bojson', 16),
('Bob Smith', 34),
('Charlie Brown', 22),
('Diana Prince', 30),
('Edward Elric', 25),
('Fiona Gallagher', 27);

select * from user;
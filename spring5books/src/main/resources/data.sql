DROP TABLE IF EXISTS book;
CREATE TABLE IF NOT EXISTS book(
    id BIGINT(20) NOT NULL AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(255),
    author VARCHAR(100),
    isbn VARCHAR(20),
    printYear INT,
    readAlready BIT NOT NULL,
    PRIMARY KEY(id)
) ENGINE = InnoDB;
INSERT INTO book (title, description, author, isbn, printYear, readAlready) VALUES
    ('First Book', 'just a book', 'A.Author', '001001', 2010, 0),
    ('Second Book', 'just another book', 'B.Author', '001002', 2010, 1),
    ('Third Book', 'yet another book', 'C.Author', '001003', 2010, 0),
    ('Forth Book', 'this book has number 4', 'D.Author', '53t626', 2000, 1),
    ('Fith Book', 'the book marked #5', 'E.E.Author', '256434', 2019, 0);

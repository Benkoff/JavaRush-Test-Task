DROP TABLE IF EXISTS book;
CREATE TABLE IF NOT EXISTS book(
    id BIGINT(20) NOT NULL AUTO_INCREMENT,
    title VARCHAR(100),
    description VARCHAR(255),
    author VARCHAR(100),
    isbn VARCHAR(20),
    printed INT,
    readalready BIT NOT NULL,
    PRIMARY KEY(id)
) ENGINE = InnoDB;
INSERT INTO book (title, description, author, isbn, printed, readalready) VALUES
    ('Java I/O', 'Java I/O tells you all you need to know about the four main categories of streams and uncovers less known features to help make your I/O operations more efficient.', 'Elliotte Rusty Harold', '1565924851', 1999, 0),
    ('The Java Handbook', 'After reading this you`ll be amazed that Java really happened.', 'Patrick Naughton, Michael Morrison', '0078821991', 1996, 0),
    ('Concurrent Programming in Java: Design Principles and Patterns', 'Superseded by the second edition.', 'Doug Lea', '0201695812', 1996, 0),
    ('The Java Virtual Machine Specification', 'tIf you''re doing anything with the virtual machine, or if you just want to know what''s going on behind the scenes, then you need this book.', 'Tim Lindholm, Frank Yellin, Bill Joy, Kathy Walrath', '020163452X', 1996, 0),
    ('Java in a Nutshell: A Desktop Quick Reference for Java Programmers', 'An excellent introduction to Java for C programmers, an excellent reference for everyone, and a bargain at $19.95.', 'David Flanagan', '1565921836', 1996, 0),
    ('The Java AWT Reference', 'This large gem of a book is often overlooked in favor of the second volume of the The Java Class Libraries: An Annotated Reference. However in many respects this is the superior book.', 'John Zukowski', '1565922409', 1997, 0),
    ('The Java Language Specification', 'For experts only. This book is full of turgid paragraphs.', 'James Gosling , Bill Joy, Guy Steele', '0201634511', 1996, 0),
    ('Thinking in Java', 'Thinking in Java is the best introduction to Java for experienced programmers. Eckel is an expert on object oriented programming, and this expertise shows in the book.', 'Bruce Eckel', '0136597238', 1998, 0),
    ('Head First Java, 2nd Edition', 'The book teaches you how to write code by working on fun examples like games, quizzes, and fun little apps. You’ll learn about networking and OOP techniques all through repetition and fun practice work.', ' Kathy Sierra, Bert Bates', '0596009205', 2013, 0),
    ('Java: A Beginner`s Guide, Seventh Edition', 'Fully updated for Java Platform it gets you started programming in Java right away.', 'Herbert Schildt', '1259589317', 2017, 0),
    ('Java: The Complete Reference, Tenth Edition', 'Fully updated for Java SE 9 this book explains how to develop, compile, debug, and run Java programs.', 'Herbert Schildt', '1259589331', 2017, 0),
    ('Java 8 in Action: Lambdas, Streams, and functional-style programming', 'The book covers lambdas, streams, and functional-style programming.', 'Raoul-Gabriel Urma, Mario Fusco, Alan Mycroft', '1617291994', 2014, 0),
    ('Java SE8 for the Really Impatient: A Short Course on the Basics (Java Series)', 'This book specifically covers Java SE8 and the new features that come along with it. Lambda expressions, annotations, and JavaFX are all covered in detail along with many other facets of the language.', 'Cay S. Horstmann', '0321927761', 2014, 0),
    ('Beginning Programming with Java For Dummies (For Dummies (Computers)) 4th Edition', 'If you’re a new programmer, or want to be, this unintimidating guide gets you on your way toward Java mastery. It explores what goes into creating a program, how to put the pieces together, debugging, and making it all work.', 'Barry A. Burd', '1118407814', 2014, 0),
    ('Core Java Volume I--Fundamentals (10th Edition)', 'Core Java® has long been recognized as the leading, no-nonsense tutorial and reference for experienced programmers who want to write robust Java code for real-world applications.', 'Cay S. Horstmann', '0134177304', 2016, 0),
    ('Java in 24 Hours, Sams Teach Yourself (Covering Java 8) (7th Edition)', 'In just 24 lessons of one hour or less, you can learn the fundamentals of Java programming.', 'Rogers Cadenhead', '0672337029', 2014, 0),
    ('Learn Java in One Day and Learn It Well (Learn Coding Fast)', 'This book is for you. You no longer have to waste your time and money trying to learn Java from boring books that are 600 pages long, expensive online courses or complicated Java tutorials that just leave you more confused and frustrated.', 'Jamie Chan', '1539397831', 2016, 0),
    ('Murach`s Beginning Java with Eclipse', 'Its goal is to ease the steep learning curve and it uses the Eclipse IDE to make you productive as quickly as possible. In fact, you`ll grow from beginner to entry-level professional!', 'Joel Murach', '1890774898', 2015, 0),
    ('Java Programming: 24-Hour Trainer', 'This is your complete beginner`s guide to the Java programming language, with easy-to-follow lessons and supplemental exercises that help you get up and running quickly.', 'Yakov Fain', '111895145X', 2015, 0),
    ('Java Performance: The Definitive Guide: Getting the Most Out of Your Code', 'In this comprehensive guide, author and Java expert Scott Oaks takes the approach that anyone who works with Java should be equally adept at understanding how code behaves in the JVM, as well as the tunings likely to help its performance.', 'Scott Oaks', '1449358454', 2014, 0),
    ('Java Programming 9th Edition', 'With this dynamic text, even first-time programmers can quickly develop useful programs while mastering the basic principles of structured and object-oriented programming.', 'Joyce Farrell', '1337397075', 2018, 0),
    ('TCP/IP Sockets in Java, Second Edition: Practical Guide for Programmers (The Practical Guides)', 'You can do a lot with TCP/IP connections and working over a network with Java. This book offers a look into the basics of networking and how to use this in everyday project work.', 'Kenneth L. Calvert, Michael J. Donahoo', '0123742552', 2008, 0),
    ('Java Network Programming', 'This practical guide provides a complete introduction to developing network programs with Java. You’ll learn how to use Java’s network class library to quickly and easily accomplish common networking tasks.', 'Elliotte Rusty Harold', '1449357679', 2013, 0),
    ('Java Generics and Collections: Speed Up the Java Development Process', 'One of the biggest updates to Java is the addition of generics. These changed how Java works and this book is the ultimate introduction to this topic.', 'Maurice Naftalin, Philip Wadler', '0596527756', 2006, 0),
    ('Java Concurrency in Practice', 'It takes many techniques from concurrent programming and merges them into one book. You’ll learn through tons of practice exercises how Java concurrency works and how to use this in your code.', 'Brian Goetz, Tim Peierls, Joshua Bloch, Joseph Bowbeer, David Holmes, Doug Lea', '0321349601', 2006, 0),
    ('Learning Reactive Programming With Java 8', 'Learn how to use RxJava and its reactive Observables to build fast, concurrent, and powerful applications through detailed examples.', 'Nickolay Tsvetinov', '1785288725', 2015, 0),
    ('RESTful Java with JAX-RS 2.0: Designing and Developing Distributed Web Services', 'Learn how to design and develop distributed web services in Java, using RESTful architectural principles and the JAX-RS 2.0 specification in Java EE 7.', 'Bill Burke', '144936134X', 2013, 0),
    ('Java Web Services: Up and Running: A Quick, Practical, and Thorough Introduction', 'Learn how to develop REST-style and SOAP-based web services and clients with this quick and thorough introduction.', 'Martin Kalin', '1449365116', 2013, 0),
    ('Java Cookbook: Solutions and Examples for Java Developers', 'From lambda expressions and JavaFX 8 to new support for network programming and mobile development, Java 8 brings a wealth of changes. This cookbook helps you get up to speed right away with hundreds of hands-on recipes across a broad range of topics.', 'Ian F. Darwin ', '144933704X', 2014, 0),
    ('Java Pocket Guide: Instant Help for Java Programmers 4th Edition', 'Any time you need quick answers for developing or debugging Java programs, this pocket guide is the ideal reference to standard features of the Java programming language and its platform.', 'Robert Liguori, Patricia Liguori', '1491938692', 2017, 0),
    ('OCA / OCP Java SE 8 Programmer Practice Tests', 'This book complements the Sybex OCA: Oracle Certified Associate Java SE 8 Programmer I Certification Study Guide and the OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide for exams 1Z0-808 and 1ZO-809.', 'Scott Selikoff, Jeanne Boyarsky', '111936339X', 2017, 0),
    ('OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808', 'It`s a comprehensive study guide for those taking the Oracle Certified Associate Java SE 8 Programmer I exam (1Z0-808). With complete coverage of 100% of the exam objectives.', 'Scott Selikoff, Jeanne Boyarsky', '1118957407', 2014, 0);

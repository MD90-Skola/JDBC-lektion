CREATE DATABASE IF NOT EXISTS student_db
DEFAULT CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;


CREATE TABLE IF NOT EXISTS student (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    class_group VARCHAR(50) NOT NULL,
    create_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

 INSERT INTO student (name, class_group) VALUES
('Alice Johansson', 'g1'),
('Bob Smith', 'g1'),
('Charlie Brown', 'g2'),
('David Wilsson', 'g2');

SELECT * FROM student;


DROP DATABASE IF EXISTS todoList;

CREATE DATABASE IF NOT EXISTS todoList;
USE todoList;

DROP TABLE IF EXISTS `User`;
CREATE TABLE IF NOT EXISTS `User`(
	UserID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	FullName 			NVARCHAR(100) NOT NULL,
	UserName 			VARCHAR(100) UNIQUE KEY NOT NULL,
    `PassWord`			VARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS `Task`;
CREATE TABLE IF NOT EXISTS `Task`(
	TaskID				INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Title				NVARCHAR(100) NOT NULL,
    `Status`			ENUM('Open','Inprogress','Done','All') DEFAULT 'Open'NOT NULL,
    Content				NVARCHAR(1000) NOT NULL,
    Creator				TINYINT UNSIGNED NOT NULL ,
    
     FOREIGN KEY(Creator)REFERENCES `User`(UserID)
);

INSERT INTO `User`	(FullName, UserName, `PassWord`) 
VALUES 					("Dương Trọng Thắng","thangdt",123456),
						("Nguyễn Huy Vũ","huyvu",123456),
                        ("Hoàng Mạnh Cường","cuongcube",123456);
                        
INSERT INTO `Task`	(Title,`Status`,Content, Creator) 
VALUES 				("Task 1","Open","","1"),
					("Task 2","Open","","2"),
                    ("Task 3","Open","","1"),
                    ("Task 4","Open","","1"),
                    ("Task 5","Open","","2"),
                    ("Task 6","Open","","3"),
                    ("Task 7","Open","","3"),
                    ("Task 8","Open","","1");


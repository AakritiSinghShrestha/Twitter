create database Twitter_db2;
use Twitter_db2;
CREATE TABLE tweets (
  id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_name VARCHAR(45) NOT NULL,
  user_handle VARCHAR(45) NOT NULL,
  user_image_url VARCHAR(100) NOT NULL,
  message VARCHAR(300) NOT NULL,
  PRIMARY KEY  (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
show tables;

describe tweets;
select * from Twitter_db2.tweets;
show databases;
drop database Twitter_db;


INSERT INTO tweets VALUES
(1,'Kaleb Burd','@kburd','https://pythonprogramming.net/static/images/finance/python-programming-language.png','Hello Twitter! Goodbye MySpace'),
(2,'Rando Cardician','@seedNull','https://upload.wikimedia.org/wikipedia/commons/a/a0/2006_Quarter_Proof.png','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sit amet nisi ac metus imperdiet fermentum at ut sem. Morbi.'),
(3,'Donald J. Trump','@realDonaldTrump','https://compote.slate.com/images/abd6b1ce-a885-4f81-a682-214877a93edd.jpeg','*censored*'),
(4,'John Smith','@notRussianBot','https://cdn.pixabay.com/photo/2017/03/14/21/00/american-flag-2144392__340.png','Who censored Trump???');





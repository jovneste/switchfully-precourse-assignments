create table videogamestore(

productid INTEGER PRIMARY KEY,
name TEXT,
price INTEGER,
amount INTEGER,
release_year INTEGER

);
INSERT INTO videogamestore VALUES (1, "COD", 56, 60,2018),
(2, "HALO", 80, 10,2004),
(3, "ZELDA", 6, 17,2006),
(4, "SLY", 5, 5,2002),
(5, "BFME2", 0, 7,2004),
(6, "r", 80, 10,2004),
(7, "f", 6, 17,2006),
(8, "t", 5, 5,2002),
(9, "y", 0, 7,2004),
(10, "u", 80, 10,2004),
(11, "i", 6, 17,2006),
(12, "o", 5, 5,2002),
(13, "p", 0, 7,2004),
(14, "Sq", 5, 5,2002),
(15, "Sf", 5, 5,1998);


select * from videogamestore order by price;
select sum(amount) as total_units_in_stock from videogamestore;


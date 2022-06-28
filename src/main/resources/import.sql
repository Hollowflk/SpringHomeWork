create table if not exists author (id bigserial primary key, name varchar(30));
create table if not exists books (id bigserial primary key, title varchar(30), price Integer);

insert into books (title,price) values ('Преступление и наказание', 200),('Идиот', 100),('ОНО', 500),('ЗЕЛЕНАЯ МИЛЯ', 340),('СИЯНИЕ', 234),('ЕВГЕНИЙ ОНЕГИН', 232),('РУСЛАН И ЛЮДМИЛА', 443),('КАПИТАНСКАЯ ДОЧКА', 456),('БЕСЫ', 789);
insert into author (name) values ('Достоевский'),('Стивен Кинг'),('Пушкин');

create table if not exists author_books (author_id int REFERENCES author (id), books_id int REFERENCES books (id));
insert into author_books (author_id, books_id) values (1,1),(1,2),(1,9),(2,3),(2,4),(2,5),(3,6),(3,7),(3,8);


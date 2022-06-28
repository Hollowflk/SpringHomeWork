create table if not exists author (id bigserial primary key, name varchar(30));
create table if not exists books (id bigserial primary key, title varchar(30));

insert into books (title) values ('Преступление и наказание'),('Идиот'),('ОНО'),('ЗЕЛЕНАЯ МИЛЯ'),('СИЯНИЕ'),('ЕВГЕНИЙ ОНЕГИН'),('РУСЛАН И ЛЮДМИЛА'),('КАПИТАНСКАЯ ДОЧКА'),('БЕСЫ');
insert into author (name) values ('Достоевский'),('Стивен Кинг'),('Пушкин');

create table if not exists author_books (author_id int REFERENCES author (id), books_id int REFERENCES books (id));
insert into author_books (author_id, books_id) values (1,1),(1,2),(1,9),(2,3),(2,4),(2,5),(3,6),(3,7),(3,8);


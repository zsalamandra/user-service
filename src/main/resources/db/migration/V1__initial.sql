create table if not exists "user"
(
    id      bigserial primary key,
    name    varchar(50),
    role_id bigserial

);

create table if not exists role
(
    id   bigserial,
    name varchar(50),
    foreign key (id) references "user" (id)
);

insert INTO "user"
VALUES (1, 'Mansur', 2),
       (2, 'John', 1),
       (3, 'Joe', 1);

insert INTO role
VALUES (1, 'user'),
       (2, 'admin');


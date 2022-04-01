create table if not exists role
(
    id   bigint unique,
    name varchar(50)
);

create table if not exists "user"
(
    id      bigint primary key,
    name    varchar(50) not null,
    role_id bigint not null,
    foreign key (role_id) references "role" (id)
);

insert INTO role VALUES
                        (1, 'user'),
                        (2, 'admin');

insert INTO "user" VALUES
                          (1, 'Mansur', 2),
                          (2, 'John', 1),
                          (3, 'Joe', 1);




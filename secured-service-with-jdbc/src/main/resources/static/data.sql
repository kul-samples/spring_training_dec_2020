insert into users (username, password,enabled) values ('india','$2a$10$t49HK7S/1QajVYe5RqM1.ewUzbmOqMLA0IDK5JDAiQrhGY8OqDZoK',true);

insert into authorities (username, authority) values ('india', 'ROLE_USER');

insert into users (username, password, enabled) values ('nepal','$2a$10$nSwbkfLjrbWWPLbnJoFgZuolxUT8RsFhYj/eEeB4groWuUexkoBFy',true);


insert into authorities (username, authority) values ('nepal', 'ROLE_ADMIN');


insert into users (username, password, enabled) values ('guest','$2a$10$hk7UqyBA3aETf/rfre4m7.TvWrEtsQW4fCInKhe2TQEyINSnG6s8a',true);


insert into authorities (username, authority) values ('guest', 'ROLE_ADMIN');
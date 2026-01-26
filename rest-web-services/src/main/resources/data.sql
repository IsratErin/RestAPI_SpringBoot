insert into user_details(id,birthdate,name)
values(101,current_date(),'Ranga');

insert into user_details(id,birthdate,name)
values(102,current_date(),'Raisa');

insert into post(id,description,user_id)
values(2001,'I want to learn AWS', 101);

insert into post(id,description,user_id)
values(2002,'I want to learn Microservices', 101);

insert into post(id,description,user_id)
values(2003,'I want to learn Docker', 102);
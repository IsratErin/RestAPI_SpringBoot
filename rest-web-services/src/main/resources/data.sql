insert into user_details(id,birthdate,name)
values(1001,current_date(),'Ranga');

insert into user_details(id,birthdate,name)
values(1002,current_date(),'Raisa');

insert into post(id,description,user_id)
values(2001,'I want to learn AWS', 1001);

insert into post(id,description,user_id)
values(2002,'I want to learn Microservices', 1001);

insert into post(id,description,user_id)
values(2003,'I want to learn Docker', 1002);
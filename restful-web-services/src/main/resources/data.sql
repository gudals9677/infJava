insert into user_details(id,birth_date,name)
values(10002, current_date(), 'Park');

insert into user_details(id,birth_date,name)
values(10003, current_date(), 'Kim');

insert into user_details(id,birth_date,name)
values(10004, current_date(), 'Lee');

insert into post(id, description, user_id)
values(20001, 'I want to test', 10002);

insert into post(id, description, user_id)
values(20002, 'Kim', 10003);

insert into post(id, description, user_id)
values(20003, 'Lee', 10004);

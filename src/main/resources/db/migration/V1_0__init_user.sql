
create sequence hibernate_sequence increment by 1 start with 100;

create table jr_user (
    id bigint primary key,
    name text,
    email text,
    phone text,
    blood_group varchar(20)
);
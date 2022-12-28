-- this script should run on postgres
--
-- psql -U postgres \i setup.sql

drop schema if exists prova cascade;
drop user if exists prova;

create user prova with password 'password';

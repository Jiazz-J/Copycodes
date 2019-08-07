create table education(id references users(id),S_name varchar(20),S_percent varchar(2),S_year number(4),i_class varchar(7),i_name varchar(20),i_percent varchar(2),i_year number(4),b_course varchar(20),b_name varchar(20),b_percent number(2),b_year number(4),p_course varchar(20),p_name varchar(20),p_percent number(2),p_year number(4));


create table work(designation varchar(20),ctc varchar(9),location varchar(12),re_location varchar(12),experience number(2),tier varchar(1));

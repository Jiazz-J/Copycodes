create table education(id references users(id),S_name varchar(20),S_percent varchar(2),S_year number(4),i_class varchar(7),i_name varchar(20),i_percent varchar(2),i_year number(4),b_course varchar(20),b_name varchar(20),b_percent number(2),b_year number(4),p_course varchar(20),p_name varchar(20),p_percent number(2),p_year number(4));


create table work(designation varchar(20),ctc varchar(9),location varchar(12),re_location varchar(12),experience number(2),tier varchar(1));


SQL> desc work;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 DESIGNATION                                        VARCHAR2(20)
 CTC                                                VARCHAR2(9)
 LOCATION                                           VARCHAR2(12)
 RE_LOCATION                                        VARCHAR2(12)
 EXPERIENCE                                         NUMBER(2)
 TIER                                               VARCHAR2(1)
 ID                                                 NUMBER(10)
 
 
 
 SQL> desc personal
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                                 NUMBER(10)
 NAME                                               VARCHAR2(20)
 DOB                                                DATE
 GENDER                                             CHAR(1)
 MARITAL                                            VARCHAR2(7)
 EMAIL                                              VARCHAR2(20)
 ADDRESS                                            VARCHAR2(30)


 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                                 NUMBER(10)
 S_NAME                                             VARCHAR2(20)
 S_PERCENT                                          VARCHAR2(2)
 S_YEAR                                             NUMBER(4)
 I_CLASS                                            VARCHAR2(7)
 I_NAME                                             VARCHAR2(20)
 I_PERCENT                                          VARCHAR2(2)
 I_YEAR                                             NUMBER(4)
 B_COURSE                                           VARCHAR2(20)
 B_NAME                                             VARCHAR2(20)
 B_PERCENT                                          NUMBER(2)
 B_YEAR                                             NUMBER(4)
 P_COURSE                                           VARCHAR2(20)
 P_NAME                                             VARCHAR2(20)
 P_PERCENT                                          NUMBER(2)
 P_YEAR                                             NUMBER(4)


SQL> desc users;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(10)
 PASSWORD                                           VARCHAR2(20)
 ROLE                                               CHAR(1)

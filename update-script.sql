
    create table departments (
        department_id serial not null,
        code varchar(100) unique,
        name varchar(100) unique,
        primary key (department_id)
    );

    create table positions (
        position_id serial not null,
        role_id integer,
        email varchar(64),
        code varchar(100),
        name varchar(100),
        primary key (position_id)
    );

    create table role_department_map (
        is_primary_department boolean,
        role_department_map_id serial not null,
        role_id integer,
        department_id bigint,
        primary key (role_department_map_id)
    );

    create table roles (
        role_id serial not null,
        code varchar(100),
        name varchar(100),
        description varchar(256),
        primary key (role_id)
    );

    alter table if exists positions 
       add constraint FKf1as2etuafbbyed7iup1vhy2c 
       foreign key (role_id) 
       references roles;

    alter table if exists role_department_map 
       add constraint FKl5lub3ole3l6pm3tdqcc9r5ti 
       foreign key (department_id) 
       references departments;

    alter table if exists role_department_map 
       add constraint FKo6hocrrcyaa304gg35a6omp6i 
       foreign key (role_id) 
       references roles;

    create table departments (
        department_id serial not null,
        code varchar(100) unique,
        name varchar(100) unique,
        primary key (department_id)
    );

    create table positions (
        position_id serial not null,
        role_id integer,
        email varchar(64),
        code varchar(100),
        name varchar(100),
        primary key (position_id)
    );

    create table role_department_map (
        is_primary_department boolean,
        role_department_map_id serial not null,
        role_id integer,
        department_id bigint,
        primary key (role_department_map_id)
    );

    create table roles (
        role_id serial not null,
        code varchar(100),
        name varchar(100),
        description varchar(256),
        primary key (role_id)
    );

    alter table if exists positions 
       add constraint FKf1as2etuafbbyed7iup1vhy2c 
       foreign key (role_id) 
       references roles;

    alter table if exists role_department_map 
       add constraint FKl5lub3ole3l6pm3tdqcc9r5ti 
       foreign key (department_id) 
       references departments;

    alter table if exists role_department_map 
       add constraint FKo6hocrrcyaa304gg35a6omp6i 
       foreign key (role_id) 
       references roles;

    create table departments (
        department_id serial not null,
        code varchar(100) unique,
        name varchar(100) unique,
        primary key (department_id)
    );

    create table positions (
        position_id serial not null,
        role_id integer,
        email varchar(64),
        code varchar(100),
        name varchar(100),
        primary key (position_id)
    );

    create table role_department_map (
        is_primary_department boolean,
        role_department_map_id serial not null,
        role_id integer,
        department_id bigint,
        primary key (role_department_map_id)
    );

    create table roles (
        role_id serial not null,
        code varchar(100),
        name varchar(100),
        description varchar(256),
        primary key (role_id)
    );

    alter table if exists positions 
       add constraint FKf1as2etuafbbyed7iup1vhy2c 
       foreign key (role_id) 
       references roles;

    alter table if exists role_department_map 
       add constraint FKl5lub3ole3l6pm3tdqcc9r5ti 
       foreign key (department_id) 
       references departments;

    alter table if exists role_department_map 
       add constraint FKo6hocrrcyaa304gg35a6omp6i 
       foreign key (role_id) 
       references roles;

    create table departments (
        department_id serial not null,
        code varchar(100) unique,
        name varchar(100) unique,
        primary key (department_id)
    );

    create table positions (
        position_id serial not null,
        role_id integer,
        email varchar(64),
        code varchar(100),
        name varchar(100),
        primary key (position_id)
    );

    create table role_department_map (
        is_primary_department boolean,
        role_department_map_id serial not null,
        role_id integer,
        department_id bigint,
        primary key (role_department_map_id)
    );

    create table roles (
        role_id serial not null,
        code varchar(100),
        name varchar(100),
        description varchar(256),
        primary key (role_id)
    );

    alter table if exists positions 
       add constraint FKf1as2etuafbbyed7iup1vhy2c 
       foreign key (role_id) 
       references roles;

    alter table if exists role_department_map 
       add constraint FKl5lub3ole3l6pm3tdqcc9r5ti 
       foreign key (department_id) 
       references departments;

    alter table if exists role_department_map 
       add constraint FKo6hocrrcyaa304gg35a6omp6i 
       foreign key (role_id) 
       references roles;

create table person (
                        id int primary key,
                        name varchar,
                        is_man Boolean,
                        birthday varchar
);

drop table person;


create table hobby (
                       id int primary key,
                       hobby_name varchar,
                       hobby_type int constraint fk_hobbytype references hobby_type(id)
);

drop table hobby;

create table hobby_type (
                            id int primary key,
                            type_name varchar
);

drop table hobby_type;

create table person_hobby (
                              id int primary key,
                              person_id int constraint fk_person references person(id),
                              hobby_id int constraint  fk_hobby references hobby(id)
);

drop table person_hobby;

insert into person (id, name, is_man, birthday) VALUES (1, 'person1', true, '2000-01-01'),
                                                       (2, 'person2', true, '2000-01-02'),
                                                       (3, 'person3', false, '2000-01-03'),
                                                       (4, 'person4', true, '2000-01-04'),
                                                       (5, 'person5', false, '2000-01-05'),
                                                       (6, 'person6', true, '2000-01-06'),
                                                       (7, 'person7', true, '2000-01-07'),
                                                       (8, 'person8', false, '2000-01-08'),
                                                       (9, 'person9', true, '2000-01-09'),
                                                       (10, 'person10', false, '2000-01-10');


insert into hobby_type (id, type_name) VALUES (1, 'active'),
                                              (2, 'passive');

insert into hobby (id, hobby_name, hobby_type) VALUES (1, 'football', 1),
                                                      (2, 'hockey', 1),
                                                      (3, 'reading', 2),
                                                      (4, 'drawing', 2),
                                                      (5, 'gym', 1);

insert into person_hobby (id, person_id, hobby_id) VALUES (1, 3, 1),
                                                          (2, 3, 2),
                                                          (3, 2, 1),
                                                          (4, 4, 1),
                                                          (5, 3, 3),
                                                          (6, 7, 4),
                                                          (7, 4, 2);

select * from person where birthday > '2000-01-05';

select is_man, count(*) from person group by is_man;

select * from person_hobby join hobby h on h.id = person_hobby.hobby_id join person p on p.id = person_hobby.person_id;

select * from person join person_hobby ph on person.id = ph.person_id join hobby h on h.id = ph.hobby_id;

select person_id, count(*)
from person_hobby
         join person p on p.id = person_hobby.person_id
group by person_id having count(*) > 1;

select hobby_type, type_name, count(*) from hobby_type join hobby h on hobby_type.id = h.hobby_type group by hobby_type, type_name;

select * from hobby join hobby_type ht on ht.id = hobby.hobby_type;






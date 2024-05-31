create table if not exists cache_response(
cache_id Integer not null,
cache_owner varchar(255) null,
active_account char null,
cache_type_id Integer null,
cache_type varchar(255) null,
cache_status varchar(255) null,
cache_description Integer null,
first_level Integer null,
parent_id varchar(255) null,
flush_interval Integer null,
read_only varchar(255) null,
status varchar(255) null,
eviction varchar(255) null,
constraint cache_response_pk primary key(cache_id));
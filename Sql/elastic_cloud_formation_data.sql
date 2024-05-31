create table if not exists elastic_cloud_formation_data(
cloud_formation_code varchar(255) not null,
cloud_formation_name varchar(255) null,
local_currency varchar(255) null,
trade_currency varchar(255) null,
short_description varchar(255) null,
data_indicator varchar(255) null,
consumed_by varchar(255) null,
data_arc Integer null,
params varchar(255) null,
filter varchar(255) null,
status varchar(255) null,
constraint elastic_cloud_formation_data_pk primary key(cloud_formation_code));
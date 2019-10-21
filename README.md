## yugabyte-geo-replication-demo

Create Table DDL

CREATE KEYSPACE IF NOT EXISTS cronos;

CREATE TABLE cronos.customers (
    customer_id text PRIMARY KEY,
    name text,
    email text,
    address text,
    birthday text,
    region text,
    "index" int,
    customer_timestamp timestamp
) WITH default_time_to_live = 0
    AND transactions = {'enabled': 'false'};

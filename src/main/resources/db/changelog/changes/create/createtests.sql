create table IF NOT EXISTS "tests"
(
    id            SERIAL PRIMARY KEY,
    name          varchar(255) not null,
    script        text         not null,
    insert_date   timestamptz  not null default current_timestamp,
    last_modified timestamptz  not null default current_timestamp
);
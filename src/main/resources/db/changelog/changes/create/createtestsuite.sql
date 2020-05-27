CREATE TABLE IF NOT EXISTS test_suite
(
    id SERIAL,
    suite_name varchar(50),
    date_added timestamptz not null default current_timestamp,
    date_modified timestamptz not null default current_timestamp,
    PRIMARY KEY (id)
)

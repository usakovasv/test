CREATE TABLE test_suite_content
(
    id SERIAL,
    test_id INTEGER REFERENCES tests (id),
    test_suite_id INTEGER REFERENCES test_suite (id),
    PRIMARY KEY (id)
)


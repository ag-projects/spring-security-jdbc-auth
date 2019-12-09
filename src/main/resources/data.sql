INSERT INTO users (username, password, enabled)
VALUES ('alex', 'pass', true),
       ('tao', 'pass', true);

INSERT INTO authorities (username, authority)
VALUES ('alex','ROLE_USER'),
       ('tao','ROLE_ADMIN');




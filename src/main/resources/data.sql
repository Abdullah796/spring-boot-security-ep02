-- Run when application starts

INSERT INTO users(username, password, enabled)
VALUES ('admin', '{noop}admin', TRUE),
       ('user', '{noop}user', TRUE);

INSERT INTO authorities(username, authority)
VALUES ('admin', 'ROLE_ADMIN'),
       ('user', 'ROLE_USER');

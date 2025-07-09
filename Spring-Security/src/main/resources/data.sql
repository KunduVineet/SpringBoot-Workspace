INSERT INTO users (username, password, enabled) VALUES
('user', '{bcrypt}$2a$10$8.UnV5l6z5O4hRxC7mUFiOf3b2VR8T3Ngv0QDi2ZMM1.n58KmlE4W', true);

INSERT INTO authorities (username, authority) VALUES
('user', 'ROLE_USER');
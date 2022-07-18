CREATE TYPE role_type AS ENUM ('manager', 'agent', 'customer');

CREATE TABLE users
(
    id SERIAL,
    username character varying NOT NULL,
    password character varying NOT NULL,
    role role_type,
    CONSTRAINT users_pkey PRIMARY KEY (id),
    CONSTRAINT users_username_key UNIQUE (username)
);

INSERT INTO public.users(
    username, password, role)
    VALUES ('admin', 'admin', 'manager'), ('C00022', 'C00022', 'customer'), ('A002', 'A002', 'agent');
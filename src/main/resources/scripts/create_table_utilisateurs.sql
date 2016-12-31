CREATE TABLE public.utilisateurs
(
  user_id integer NOT NULL,
  user_nom character varying,
  user_prenom character varying,
  user_login character varying,
  user_password character varying,
  user_age integer,
  user_email character varying,
  user_sexe character varying,
  CONSTRAINT user_pk PRIMARY KEY (user_id),
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.utilisateurs
  OWNER TO postgres;

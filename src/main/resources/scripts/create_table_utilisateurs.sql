CREATE TABLE public.utilisateurs
(
  user_id SERIAL PRIMARY KEY,
  user_nom character varying,
  user_prenom character varying,
  user_login character varying,
  user_password character varying,
  user_age integer,
  user_email character varying,
  user_sexe character varying
  user_signale boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.utilisateurs
  OWNER TO postgres;

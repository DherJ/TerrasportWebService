CREATE TABLE public.utilisateurs
(
  user_id integer NOT NULL,
  user_nom character varying,
  user_prenom character varying,
  user_login character varying,
  user_password character varying,
  user_age integer,
  user_email character varying,
  user_sexe_id integer,
  CONSTRAINT user_pk PRIMARY KEY (user_id),
  CONSTRAINT user_sexe_fk FOREIGN KEY (user_sexe_id)
      REFERENCES public.sexe (sexe_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.utilisateurs
  OWNER TO postgres;

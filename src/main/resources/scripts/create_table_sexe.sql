-- Table: public.sexe

-- DROP TABLE public.sexe;

CREATE TABLE public.sexe
(
  sexe_id integer NOT NULL,
  sexe_libelle character varying,
  CONSTRAINT sexe_pk PRIMARY KEY (sexe_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.sexe
  OWNER TO postgres;

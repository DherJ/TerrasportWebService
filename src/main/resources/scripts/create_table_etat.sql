-- Table: public.etat

-- DROP TABLE public.etat;

CREATE TABLE public.etat
(
  etat_id integer NOT NULL,
  etat_libelle character varying,
  CONSTRAINT etat_pk PRIMARY KEY (etat_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.etat
  OWNER TO postgres;

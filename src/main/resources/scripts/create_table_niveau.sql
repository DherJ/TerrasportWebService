-- Table: public.niveau

-- DROP TABLE public.niveau;

CREATE TABLE public.niveau
(
  niveau_id integer NOT NULL,
  niveau_libelle character varying,
  CONSTRAINT niveau_pk PRIMARY KEY (niveau_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.niveau
  OWNER TO postgres;

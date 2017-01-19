-- Table: public.niveau

-- DROP TABLE public.niveau;

CREATE TABLE public.niveau
(
  niveau_id SERIAL PRIMARY KEY,
  niveau_libelle character varying
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.niveau
  OWNER TO postgres;

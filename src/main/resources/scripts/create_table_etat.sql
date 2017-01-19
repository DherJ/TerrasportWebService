-- Table: public.etat

-- DROP TABLE public.etat;

CREATE TABLE public.etat
(
  etat_id SERIAL PRIMARY KEY,
  etat_libelle character varying
);
ALTER TABLE public.etat
  OWNER TO postgres;

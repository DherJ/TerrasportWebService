-- Table: public.type_sport

-- DROP TABLE public.type_sport;

CREATE TABLE public.type_sport
(
  type_sport_id SERIAL PRIMARY KEY,
  type_sport_libelle character varying
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.type_sport
  OWNER TO postgres;

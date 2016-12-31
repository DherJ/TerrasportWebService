-- Table: public.type_sport

-- DROP TABLE public.type_sport;

CREATE TABLE public.type_sport
(
  type_sport_id integer NOT NULL,
  type_sport_libelle character varying,
  CONSTRAINT type_terrain_pk PRIMARY KEY (type_sport_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.type_sport
  OWNER TO postgres;

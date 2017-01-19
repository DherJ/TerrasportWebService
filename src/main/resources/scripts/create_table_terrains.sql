-- Table: public.terrains

-- DROP TABLE public.terrains;

CREATE TABLE public.terrains
(
  terrain_id SERIAL PRIMARY KEY,
  terrain_latitude character varying,
  terrain_longitude character varying,
  terrain_public boolean,
  terrain_est_occupe boolean,
  terrain_type_sport_id integer,
  CONSTRAINT terrains_fk FOREIGN KEY (terrain_type_sport_id)
      REFERENCES public.type_sport (type_sport_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.terrains
  OWNER TO postgres;

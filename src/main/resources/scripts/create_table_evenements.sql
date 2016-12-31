-- Table: public.evenements

-- DROP TABLE public.evenements;

CREATE TABLE public.evenements
(
  evenement_id integer NOT NULL,
  evenement_terrain_id integer,
  evenement_sport_id integer,
  evenement_user_id integer,
  evenement_niveau_id integer,
  evenement_prive boolean,
  evenement_nb_participants integer,
  evenement_nb_places_restantes integer,
  CONSTRAINT evenement_pk PRIMARY KEY (evenement_id),
  CONSTRAINT evenement_niveau_fk FOREIGN KEY (evenement_niveau_id)
      REFERENCES public.niveau (niveau_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT evenement_sport_fk FOREIGN KEY (evenement_sport_id)
      REFERENCES public.type_sport (type_sport_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT evenement_terrain_fk FOREIGN KEY (evenement_terrain_id)
      REFERENCES public.terrains (terrain_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT evenement_user_fk FOREIGN KEY (evenement_user_id)
      REFERENCES public.utilisateurs (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.evenements
  OWNER TO postgres;

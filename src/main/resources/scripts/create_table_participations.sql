-- Table: public.participations

-- DROP TABLE public.participations;

CREATE TABLE public.participations
(
  participations_id integer NOT NULL,
  participations_evenement_id integer,
  participations_etat_id integer,
  participations_user_id integer,
  participations_date timestamp without time zone,
  CONSTRAINT participations_pk PRIMARY KEY (participations_id),
  CONSTRAINT participations_etat_fk FOREIGN KEY (participations_etat_id)
      REFERENCES public.etat (etat_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT participations_evenement_fk FOREIGN KEY (participations_evenement_id)
      REFERENCES public.evenements (evenement_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT participations_user_fk FOREIGN KEY (participations_user_id)
      REFERENCES public.utilisateurs (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.participations
  OWNER TO postgres;

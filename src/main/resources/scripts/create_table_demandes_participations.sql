-- Table: public.participations

-- DROP TABLE public.participations;

CREATE TABLE public.demandes_participations
(
  demandes_participations_id integer NOT NULL,
  demandes_participations_evenement_id integer,
  demandes_participations_etat_id integer,
  demandes_participations_user_id integer,
  demandes_participations_date timestamp without time zone,
  CONSTRAINT demandes_participations_pk PRIMARY KEY (demandes_participations_id),
  CONSTRAINT demandes_participations_etat_fk FOREIGN KEY (demandes_participations_etat_id)
      REFERENCES public.etat (etat_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT demandes_participations_evenement_fk FOREIGN KEY (demandes_participations_evenement_id)
      REFERENCES public.evenements (evenement_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT demandes_participations_user_fk FOREIGN KEY (demandes_participations_user_id)
      REFERENCES public.utilisateurs (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.demandes_participations
  OWNER TO postgres;

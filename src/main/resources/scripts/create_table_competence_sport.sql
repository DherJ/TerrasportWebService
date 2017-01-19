-- Table: public.competence_sport

-- DROP TABLE public.competence_sport;

CREATE TABLE public.competence_sport
(
  competence_user_id SERIAL PRIMARY KEY,
  competence_type_sport_id integer NOT NULL,
  competence_niveau_id integer NOT NULL,
  CONSTRAINT competence_niveau_fk FOREIGN KEY (competence_niveau_id)
      REFERENCES public.niveau (niveau_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT competence_sport_fk FOREIGN KEY (competence_type_sport_id)
      REFERENCES public.type_sport (type_sport_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT competence_user_fk FOREIGN KEY (competence_user_id)
      REFERENCES public.utilisateurs (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.competence_sport
  OWNER TO postgres;

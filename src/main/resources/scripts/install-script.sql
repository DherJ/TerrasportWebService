-- Table: public.etat

-- DROP TABLE public.etat;

CREATE TABLE public.etat
(
  etat_id SERIAL PRIMARY KEY,
  etat_libelle character varying
);
ALTER TABLE public.etat
  OWNER TO postgres;
  
  
  
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
  
  
CREATE TABLE public.utilisateurs
(
  user_id SERIAL PRIMARY KEY,
  user_nom character varying,
  user_prenom character varying,
  user_login character varying,
  user_password character varying,
  user_age integer,
  user_email character varying,
  user_sexe character varying
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.utilisateurs
  OWNER TO postgres;
  

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
  
  
-- Table: public.terrains

-- DROP TABLE public.terrains;

CREATE TABLE public.terrains
(
  terrain_id SERIAL PRIMARY KEY,
  terrain_latitude character varying,
  terrain_longitude character varying,
  terrain_nom character varying,
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
  
  
-- Table: public.evenements

-- DROP TABLE public.evenements;

CREATE TABLE public.evenements
(
  evenement_id SERIAL PRIMARY KEY,
  evenement_terrain_id integer,
  evenement_sport_id integer,
  evenement_user_id integer,
  evenement_niveau_id integer,
  evenement_prive boolean,
  evenement_nb_participants integer,
  evenement_nb_places_restantes integer,
  evenement_date timestamp without time zone,
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
  
  
-- Table: public.participations

-- DROP TABLE public.participations;

CREATE TABLE public.participations
(
  participations_id SERIAL PRIMARY KEY,
  participations_evenement_id integer,
  participations_etat_id integer,
  participations_user_id integer,
  participations_date timestamp without time zone,
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
  

-- Table: public.participations

-- DROP TABLE public.participations;

CREATE TABLE public.demandes_participations
(
  demandes_participations_id SERIAL PRIMARY KEY,
  demandes_participations_evenement_id integer,
  demandes_participations_etat_id integer,
  demandes_participations_user_id integer,
  demandes_participations_date timestamp without time zone,
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

  
  
--   TYPE SPORT --
INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Football');
    
INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Rugby');
    
INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Basket');

INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Handball');

INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Golf');    
    
INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Baseball');    
    
INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Tennis');    

INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Volleyball');
    
    
--   ETAT --
INSERT INTO public.etat(etat_libelle)
    VALUES ('En attente');

INSERT INTO public.etat(etat_libelle)
    VALUES ('Validée');
    
INSERT INTO public.etat(etat_libelle)
    VALUES ('Refusée');
    

--   NIVEAU --
INSERT INTO public.niveau(niveau_libelle)
    VALUES ('Débutant');

INSERT INTO public.niveau(niveau_libelle)
    VALUES ('Intermédiaire');
    
INSERT INTO public.niveau(niveau_libelle)
    VALUES ('Confirmé');
    
    
    
--   UTILISATEURS --
INSERT INTO public.utilisateurs(
            user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES ('nom1', 'prenom1', 'login1', 'password1', 10, 'email1@email1', 'Homme');
            
INSERT INTO public.utilisateurs(
            user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES ('nom2', 'prenom2', 'login2', 'password2', 33, 'email2@email2', 'Homme');
     
INSERT INTO public.utilisateurs(
            user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES ('nom3', 'prenom3', 'login3', 'password3', 54, 'email3@email3', 'Femme');
           
INSERT INTO public.utilisateurs(
            user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES ('nom4', 'prenom4', 'login4', 'password4', 23, 'email4@email4', 'Homme');   
           
 INSERT INTO public.utilisateurs(
            user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES ('nom5', 'prenom5', 'login5', 'password5', 19, 'email5@email5', 'Femme');
           
    
--   TERRAINS --
-----------------Football-----------------

INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.609130', '3.176946', 'Nom1', TRUE, TRUE, 1);

INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.615159', '3.100032', 'Nom2', FALSE, FALSE, 1);

INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.439613', '3.424118', 'Nom3', TRUE, TRUE, 1);

INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.348421', '3.528467', 'Nom4', TRUE, FALSE, 1);
    
    
-----------------Basket-----------------

INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.290407', '2.737431', 'Nom5', TRUE, TRUE, 2);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.645443', '2.737431', 'Nom6', FALSE, FALSE, 2);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.292021', '2.742903', 'Nom7', TRUE, TRUE, 2);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.627081', '3.135568', 'Nom8', FALSE, TRUE, 2);
    

-----------------Rugby-----------------


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.631224', '3.135958', 'Nom9', FALSE, TRUE, 3);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.611378', '3.150182', 'Nom10', FALSE, TRUE, 3);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.616661', '3.163175', 'Nom11', TRUE, TRUE, 3);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.681323', '3.076493', 'Nom12', TRUE, TRUE, 3);
   
    
-----------------Handball-----------------

    
INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.644097', '3.087379', 'Nom13', FALSE, FALSE, 4);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.683534', '3.046738', 'Nom14', TRUE, TRUE, 4);
 
    
-----------------GOLF-----------------

INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.689403', '3.107092', 'Practice golf', TRUE, TRUE, 5);   
 
    
-----------------VOLLEY-----------------
    
    
INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.139420', '3.197123', 'Volley', TRUE, TRUE, 8);     
    
    
-----------------TENNIS-----------------
    
    
INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.329459', '3.1-7456', 'Tennis', TRUE, TRUE, 7); 
    
       
    
--   COMPETENCE UTILISATEUR SPORT --
 INSERT INTO public.competence_sport(
            competence_user_id, competence_type_sport_id, competence_niveau_id)
    VALUES (1, 1, 1);
           
 INSERT INTO public.competence_sport(
            competence_user_id, competence_type_sport_id, competence_niveau_id)
    VALUES (2, 1, 2);
    
 INSERT INTO public.competence_sport(
            competence_user_id, competence_type_sport_id, competence_niveau_id)
    VALUES (3, 2, 2);
    
 INSERT INTO public.competence_sport(
            competence_user_id, competence_type_sport_id, competence_niveau_id)
    VALUES (4, 1, 3);
    
 INSERT INTO public.competence_sport(
            competence_user_id, competence_type_sport_id, competence_niveau_id)
    VALUES (5, 3, 3);
    
  
--   EVENEMENTS --
INSERT INTO public.evenements(
            evenement_terrain_id, evenement_sport_id, evenement_user_id, 
            evenement_niveau_id, evenement_prive, evenement_nb_participants, 
            evenement_nb_places_restantes, evenement_date)
    VALUES (1, 1, 1,  1, true, 11, 11, CURRENT_TIMESTAMP);
            
INSERT INTO public.evenements(
            evenement_terrain_id, evenement_sport_id, evenement_user_id, 
            evenement_niveau_id, evenement_prive, evenement_nb_participants, 
            evenement_nb_places_restantes, evenement_date)
    VALUES (2, 2, 2, 1, false, 11, 3, CURRENT_TIMESTAMP);
            
INSERT INTO public.evenements(
            evenement_terrain_id, evenement_sport_id, evenement_user_id, 
            evenement_niveau_id, evenement_prive, evenement_nb_participants, 
            evenement_nb_places_restantes, evenement_date)
    VALUES (3, 3, 3, 1, true, 11, 8, CURRENT_TIMESTAMP + interval '1 week');

            
--   DEMANDES PARTICIPATIONS -- 
INSERT INTO public.demandes_participations(
            demandes_participations_evenement_id, demandes_participations_etat_id, 
            demandes_participations_user_id, demandes_participations_date)
    VALUES (1, 1, 1, CURRENT_TIMESTAMP);

INSERT INTO public.demandes_participations(
            demandes_participations_evenement_id, demandes_participations_etat_id, 
            demandes_participations_user_id, demandes_participations_date)
    VALUES (2, 2, 2, CURRENT_TIMESTAMP);
 
INSERT INTO public.demandes_participations(
            demandes_participations_evenement_id, demandes_participations_etat_id, 
            demandes_participations_user_id, demandes_participations_date)
    VALUES (2, 2, 3, CURRENT_TIMESTAMP + interval '1 week');   
            
--   PARTICIPATIONS -- 
INSERT INTO public.participations(
            participations_evenement_id,
            participations_user_id, participations_date)
    VALUES (3, 5, CURRENT_TIMESTAMP);

INSERT INTO public.participations(
            participations_evenement_id, 
            participations_user_id, participations_date)
    VALUES (2, 4, CURRENT_TIMESTAMP);
 
INSERT INTO public.participations(
            participations_evenement_id,
            participations_user_id, participations_date)
    VALUES (3, 3, CURRENT_TIMESTAMP + interval '1 week'); 
    
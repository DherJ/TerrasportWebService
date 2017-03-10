--   TYPE SPORT --
INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Football');
    
INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Rugby');
    
INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Basket');

INSERT INTO public.type_sport(type_sport_libelle)
    VALUES ('Handball');
    
    
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
            user_email, user_sexe, user_signale)
    VALUES ('nom1', 'prenom1', 'login1', 'password1', 10, 'email1@email1', 'Homme', false);
            
INSERT INTO public.utilisateurs(
            user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe, user_signale)
    VALUES ('nom2', 'prenom2', 'login2', 'password2', 33, 'email2@email2', 'Homme', false);
     
INSERT INTO public.utilisateurs(
            user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe, user_signale)
    VALUES ('nom3', 'prenom3', 'login3', 'password3', 54, 'email3@email3', 'Femme', false);
           
INSERT INTO public.utilisateurs(
            user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe, user_signale)
    VALUES ('nom4', 'prenom4', 'login4', 'password4', 23, 'email4@email4', 'Homme', false);   
           
 INSERT INTO public.utilisateurs(
            user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe, user_signale)
    VALUES ('nom5', 'prenom5', 'login5', 'password5', 19, 'email5@email5', 'Femme', false);
           
    
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
    VALUES ('50.631224', '3.135958', 'Nom8', FALSE, TRUE, 3);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.611378', '3.150182', 'Nom9', FALSE, TRUE, 3);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.616661', '3.163175', 'Nom10', TRUE, TRUE, 3);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.681323', '3.076493', 'Nom11', TRUE, TRUE, 3);
   
    
-----------------Handball-----------------

    
INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.644097', '3.087379', 'Nom12', FALSE, FALSE, 4);


INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_nom, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('50.683534', '3.046738', 'Nom13', TRUE, TRUE, 4);
    
    
            
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
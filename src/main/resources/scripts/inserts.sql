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
    VALUES ('Intermédiare');
    
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
INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('100.100.10.10', '100.100.10.10', TRUE, TRUE, 1);

INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('100.100.10.10', '100.100.10.10', TRUE, TRUE, 2);
            
INSERT INTO public.terrains(
            terrain_latitude, terrain_longitude, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES ('100.100.10.10', '100.100.10.10', TRUE, FALSE, 3);
            
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
    VALUES (3, 3, 3, 1, true, 11, 8, CURRENT_TIMESTAMP);

            
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
    VALUES (2, 2, 3, CURRENT_TIMESTAMP);   
            
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
    VALUES (3, 3, CURRENT_TIMESTAMP); 
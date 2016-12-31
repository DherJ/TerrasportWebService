--   TYPE SPORT --
INSERT INTO public.type_sport(
            type_sport_id, type_sport_libelle)
    VALUES (1, 'Football');
    
INSERT INTO public.type_sport(
            type_sport_id, type_sport_libelle)
    VALUES (2, 'Rugby');
    
INSERT INTO public.type_sport(
            type_sport_id, type_sport_libelle)
    VALUES (3, 'Basket');

INSERT INTO public.type_sport(
            type_sport_id, type_sport_libelle)
    VALUES (4, 'Handball');
    
    
--   ETAT --
INSERT INTO public.etat(
            etat_id, etat_libelle)
    VALUES (1, 'En attente');

INSERT INTO public.etat(
            etat_id, etat_libelle)
    VALUES (2, 'Validée');
    
INSERT INTO public.etat(
            etat_id, etat_libelle)
    VALUES (3, 'Refusée');
    

--   NIVEAU --
INSERT INTO public.niveau(
            niveau_id, niveau_libelle)
    VALUES (1, 'Débutant');

INSERT INTO public.niveau(
            niveau_id, niveau_libelle)
    VALUES (2, 'Intermédiare');
    
INSERT INTO public.niveau(
            niveau_id, niveau_libelle)
    VALUES (3, 'Confirmé');
    
    
--   SEXE --
INSERT INTO public.sexe(
            sexe_id, sexe_libelle)
    VALUES (1, 'Homme');

INSERT INTO public.sexe(
            sexe_id, sexe_libelle)
    VALUES (2, 'Femme');
    
    
--   UTILISATEURS --
INSERT INTO public.utilisateurs(
            user_id, user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES (1, 'nom1', 'prenom1', 'login1', 'password1', 10, 
            'email1@email1', 'Homme');
            
INSERT INTO public.utilisateurs(
            user_id, user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES (2, 'nom2', 'prenom2', 'login2', 'password2', 33, 
            'email2@email2', 'Homme');
     
INSERT INTO public.utilisateurs(
            user_id, user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES (3, 'nom3', 'prenom3', 'login3', 'password3', 54, 
            'email3@email3', 'Femme');
           
INSERT INTO public.utilisateurs(
            user_id, user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES (4, 'nom4', 'prenom4', 'login4', 'password4', 23, 
            'email4@email4', 'Homme');   
           
 INSERT INTO public.utilisateurs(
            user_id, user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe)
    VALUES (5, 'nom5', 'prenom5', 'login5', 'password5', 19, 
            'email5@email5', 'Femme');
           
    
--   TERRAINS --
INSERT INTO public.terrains(
            terrain_id, terrain_latitude, terrain_longitude, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES (1, '100.100.10.10', '100.100.10.10', TRUE, 
            TRUE, 1);

INSERT INTO public.terrains(
            terrain_id, terrain_latitude, terrain_longitude, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES (2, '100.100.10.10', '100.100.10.10', TRUE, 
            TRUE, 2);
            
INSERT INTO public.terrains(
            terrain_id, terrain_latitude, terrain_longitude, terrain_public, 
            terrain_est_occupe, terrain_type_sport_id)
    VALUES (3, '100.100.10.10', '100.100.10.10', TRUE, 
            FALSE, 3);
            
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
            evenement_id, evenement_terrain_id, evenement_sport_id, evenement_user_id, 
            evenement_niveau_id, evenement_prive, evenement_nb_participants, 
            evenement_nb_places_restantes)
    VALUES (1, 1, 1, 1, 
            1, true, 11, 
            11);
            
INSERT INTO public.evenements(
            evenement_id, evenement_terrain_id, evenement_sport_id, evenement_user_id, 
            evenement_niveau_id, evenement_prive, evenement_nb_participants, 
            evenement_nb_places_restantes)
    VALUES (2, 2, 2, 2, 
            1, false, 11, 
            3);
            
INSERT INTO public.evenements(
            evenement_id, evenement_terrain_id, evenement_sport_id, evenement_user_id, 
            evenement_niveau_id, evenement_prive, evenement_nb_participants, 
            evenement_nb_places_restantes)
    VALUES (3, 3, 3, 3, 
            1, true, 11, 
            8);

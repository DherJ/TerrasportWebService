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
            user_email, user_sexe_id)
    VALUES (1, 'nom1', 'prenom1', 'login1', 'password1', 10, 
            'email1@email1', 1);
            
INSERT INTO public.utilisateurs(
            user_id, user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe_id)
    VALUES (2, 'nom2', 'prenom2', 'login2', 'password2', 33, 
            'email2@email2', 2);
     
INSERT INTO public.utilisateurs(
            user_id, user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe_id)
    VALUES (3, 'nom3', 'prenom3', 'login3', 'password3', 54, 
            'email3@email3', 1);
           
INSERT INTO public.utilisateurs(
            user_id, user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe_id)
    VALUES (4, 'nom4', 'prenom4', 'login4', 'password4', 23, 
            'email4@email4', 2);   
           
 INSERT INTO public.utilisateurs(
            user_id, user_nom, user_prenom, user_login, user_password, user_age, 
            user_email, user_sexe_id)
    VALUES (5, 'nom5', 'prenom5', 'login5', 'password5', 19, 
            'email5@email5', 2);
           
            
 
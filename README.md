# Terrasport WebServices

Web services pour gérer les données de l'application Terrasport

#Mapping des URLS 


## Niveau
* GET http://localhost:8080/niveau/all


## Etat
* GET http://localhost:8080/etat/all


## Utilisateur
* GET http://localhost:8080/utilisateur/all
* GET http://localhost:8080/utilisateur/{utilisateurId}
* GET http://localhost:8080/utilisateur/?login={login}&password={password}


## Terrain
* GET http://localhost:8080/terrain/all
* GET http://localhost:8080/terrain/public
* GET http://localhost:8080/terrain/prive
* GET http://localhost:8080/terrain/sport/{sportId}
* GET http://localhost:8080/terrain/{terrainId}
* POST http://localhost:8080/terrain/sauvegarder&{data}
* POST http://localhost:8080/terrain/changer-etat&{data}
* GET http://localhost:8080/terrain/supprimer/{terrainId}


## Evènement
* GET http://localhost:8080/evenement/all
* GET http://localhost:8080/evenement/public
* GET http://localhost:8080/evenement/prive
* GET http://localhost:8080/evenement/sport/{sportId}
* GET http://localhost:8080/evenement/utilisateur/{utilisateurId}
* GET http://localhost:8080/evenement/{evenementId}
* POST http://localhost:8080/evenement/sauvegarder&{data}
* POST http://localhost:8080/evenement/ajouterMembre&{data}
* POST http://localhost:8080/evenement/supprimerMembre&{data}
* POST http://localhost:8080/evenement/supprimer/{evenementId}


## Participations
* GET http://localhost:8080/participation/all
* GET http://localhost:8080/participation/all/evenement/{evenementId}
* GET http://localhost:8080/participation/all/utilisateur/{utilisateurId}
* GET http://localhost:8080/participation/{participationId}
* POST http://localhost:8080/participation/sauvegarder&{data}


## Demandes de participations
* GET http://localhost:8080/demande-participation/all
* GET http://localhost:8080/demande-participation/all/evenement/{evenementId}
* GET http://localhost:8080/demande-participation/all/evenement/{evenementId}/attente
* GET http://localhost:8080/demande-participation/all/evenement/{evenementId}/validee
* GET http://localhost:8080/demande-participation/all/utilisateur/{utilisateurId}
* GET http://localhost:8080/demande-participation/{demandeParticipationId}
* POST http://localhost:8080/demande-participation/sauvegarder&{data}
* POST http://localhost:8080/demande-participation/miseAjourEtatDemande&{data}



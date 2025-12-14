🛠️ Gestion d’une Quincaillerie


 ### Présentation du projet

Ce projet consiste à implémenter une version simplifiée d’un catalogue de pièces de quincaillerie en Java.
Il est issu d’un énoncé pédagogique de la Licence d’Informatique de l’Université de Montpellier 2, proposé par Marianne Huchard.

L’objectif est de modéliser différents types de pièces, leurs relations, ainsi que la gestion d’un catalogue et de clients, en appliquant les principes fondamentaux de la programmation orientée objet.

 ### Types de pièces gérées

Le système distingue trois types de pièces :

🔹 Pièces de base

Éléments simples (vis, clou, pneu, rayon, etc.), caractérisés par :

un nom

une référence (préfixe 00)

un prix

une durée de garantie (en mois)

une durée de fabrication (en jours)

🔹 Pièces composites en kit

Pièces livrées démontées avec notice :

référence préfixe 01

durée de montage par un particulier

prix = somme des composants

garantie = moitié de la plus courte garantie des pièces de base

durée de fabrication = durée maximale des composants

🔹 Pièces composites montées

Assemblées en atelier :

référence préfixe 02

prix de montage

durée de montage en atelier

prix = composants + montage

garantie = plus courte garantie + 6 mois

durée de fabrication = max composants + montage

 ### Conception UML

Le projet s’appuie sur un diagramme UML mettant en œuvre :

héritage (Piece, PieceDeBase, PieceComposite)

composition (pièces composées d’autres pièces)

polymorphisme

Chaque classe implémente notamment les méthodes :

toString()

affiche()

prix()

dureeGarantie()

dureeFabrication()

ajoute(Piece p)

 ### Catalogue de pièces

Une classe Catalogue permet de :

stocker une collection de pièces

éviter les doublons (nom + référence)

afficher une liste synthétique des pièces

afficher la fiche détaillée d’une pièce donnée

👤 Gestion des clients

Le projet inclut également la gestion de clients :

Client (classe abstraite)

Particulier (civilité, prénom, nom)

Entreprise (nom, numéro SIRET)

Un type énuméré Civilite est utilisé pour représenter les titres (Monsieur, Madame, Mademoiselle).

 ###  Objectifs pédagogiques

Ce projet permet de pratiquer :

la programmation orientée objet en Java

l’héritage, la composition et le polymorphisme

les collections (ArrayList)

les classes abstraites et énumérations

la modélisation UML

la structuration d’un projet Java propre et lisible

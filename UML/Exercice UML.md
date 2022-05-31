# Exercice : MonAuto
Une réparation est toujours relative à un véhicule. La facture est envoyée au propriétaire (qui est toujours un client) du véhicule ou à une compagnie d'assurance en cas d'accident; une compagnie d'assurance est un client pour le garage. En cas de réparation en garantie, aucune facture n'est envoyée.
Le modèle doit contenir les renseignements qui permettent de faire la facture, selon les règles suivantes :
- Un véhicule vendu par MonAuto bénéficie d'une année de garantie à partir de la date de livraison.
- Pour bénéficier d'une réparation sous garantie, le client doit amener son véhicule à l'atelier avant l'expiration du délai de garantie. En fin de période de garantie, l'atelier peut être surchargé et le Chef d'atelier ne pourra pas toujours effectuer la réparation avant la date d'expiration. Pour résoudre ce dilemme et éviter toute réclamation, lorsqu'un client prend un rendez-vous pour effectuer une réparation en garantie le Chef d'atelier prépare une fiche de réparation "garantie" et y indique la date de la demande de rendez-vous du client, en plus des 2 dates de réception et restitution du véhicule pour la réparation; cette date de demande de rendez-vous sera utilisée comme critère de réparation en garantie.

## Quelques précisions :

Nous ne gérons pas l'historique des changements de propriétaires des voitures; chaque fois qu'une voiture
change de propriétaire, un nouveau véhicule sera créé avec indication de la nouvelle immatriculation, du
nouveau propriétaire et de la date de livraison s'il s'agit d'une vente de MonAuto.

1. Proposez un diagramme de classe à partir du scénario donné
2. Faites la transformation du diagramme de classes vers un projet orienté objet en Python
3. Créez quelques instances pour tester votre cas d'étude

Liens utiles :
- Orienté Objet en Python : ```https://realpython.com/python3-object-oriented-programming/```

Lien du cours UML et Orienté Objet :
https://uniren1-my.sharepoint.com/:p:/r/personal/elyes_cherfa_univ-rennes1_fr/_layouts/15/doc2.aspx?sourcedoc=%7B2F5717A6-D5A7-471F-BBCF-7652B298CFD1%7D&file=GLA-UML.pptx&wdOrigin=OFFICECOM-WEB.START.REC&ct=1653372382130&action=edit&mobileredirect=true&cid=5ff8907c-68f0-4f08-b861-92f7d15b51a2&PreviousSessionID=398e2821-a87c-a0cd-1cf4-d551a79ac634

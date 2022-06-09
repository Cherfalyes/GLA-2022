# TP Tests

L'objectif de ce TP est de se familiariser avec la notion de tests, ainsi que d'initier le développement dirigée par les tests.

## Exercice 01 : Création de tests unitaires
À partir des algorithmes du fichier X.py, réalisez un ensemble de tests pour chaque fonction tout en tâchant de couvrir l'integralité du code.

1. Téléchargez les deux fichiers sort.py et test.py ou clonez le répo git courant.

2. Le projet que vous venez de cloner contient une fonction def bubble_sort(array) à l’intérieur du fichier sort.py. Cette fonction est capable de trier un tableau qui contient jusqu’à 5 éléments. Vous pouvez essayer le programme en tapant la commande python sort.py. Vous pouvez changer le code de la fonction main afin d’essayer le programme avec différents tableaux.

3. Le repository contient également un fichier test.py. Vous pouvez lancer les tests contenus dans ce fichier à l’aide de la commande : python -m unittest test. Actuellement le fichier ne contient qu’un seul test exemple pour vous montrer le fonctionnement.

4. Nous allons réaliser des tests à l’aide de critères structurels. Ajouter des tests pour respecter le critère de couverture de tous les chemins élémentaires de la fonction bubble_sort(array).

5. Ajouter les tests permettant de tester les 2 chemins.

6. Ajouter des tests aux limites que vous jugerez pertinents

## Exercice 02 : Distance d’arrêt d’un véhicule  

Pour calculer la distance d’arrêt d’un véhicule, on applique la formule  :  
$$distanceArret = reaction + freinage $$
-  « reaction » est la distance parcourue par la voiture pendant le temps de réaction  
du conducteur ;   
$$reaction = vitesse/3.6$$
- « freinage » est la distance parcourue par la voiture pendant le temps de freinage ;  
$$freinage = vitesse^2/200$$
Remarque :  
Pour les différentes fonctions à écrire, vous devez incorporer au moins 2 tests unitaires par  
fonctions. Les résultats devront être arrondis au mètre près.  
1.  Écrire une fonction  «  reaction(v) »  qui à partir de la vitesse du véhicule retourne la  
distance de réaction.  
2.  Écrire une fonction  «  freinage(v) »  qui à partir de la vitesse du véhicule retourne la  
distance de freinage.  
3.   Écrire une fonction «  distanceArret(v) »  qui à partir de la vitesse du véhicule retourne la distance totale d'arrêt.
4. Écrire un programme qui demande la vitesse a vitesse du véhicule à l’utilisateur et qui affiche la distance d’arrêt.  
5. Améliorer l'algorithme pour qu'il demande en plus la distance D à laquelle se situe un obstacle et indique si le conducteur pourra freiner à temps quand il l'aperçoit.
6.  Sur route mouillée, on estime que la distance de freinage est multipliée par 2.  
Demander l’état de la route à l’utilisateur et  modifier la fonction  « freinage(v) »  pour  calculer la distance de freinage en conséquence

## Exercice 03 : Déveleppement dirigé par les tests
Le fichier "execises.py" comprend un ensemble de tests unitaires écrits en Python. 
1. Dans un premier temps, lancez ces tests et vérifiez qu'ils ne passent pas. 
2. Dans un second temps, il vous est demandé de compléter le code des fonctions afin que les tests soient satisfaits.

## Remise des codes et notation :
Les codes des trois exercices (fortement commentés et chaque exercice dans un répertoire à part) sont à remettre dans un fichier ZIP sous le format Nom_Prénom_Tests.zip (Nom1_Nom2_Tests.zip pour les binômes) dans le répertoire google drive suivant :
https://drive.google.com/drive/folders/1oXEO6quANaVknfbUeRMteUxdGK-Ka-YC

Ce TP constitue la note de CC.

La date limite de remise des codes est pour le vendredi 10 juin 2022.


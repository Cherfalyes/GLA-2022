## TP Git : prise en main
Nous allons utiliser la forge Gitlab fournie par la plate-forme ISTIC ESIR pour héberger ce TP.
Pour rappel, l’ensemble des commandes Git est rappelé ici :
https://education.github.com/git-cheat-sheet-education.pdf

Vous me donnerez accès à chacun de vos dépôts par binôme pour la notation et vous déposerez à la racine de votre dépôt à la fin du TP un fichier README.MD contenant votre compte rendu.
1. Connectez vous ou créez un compte sur la plate-forme Gitlab :
https://gitlab.istic.univ-rennes1.fr/

2. Créer un nouveau projet TPGit
Vous partagerez ce dépôt au sein de votre binôme. Un seul membre du binôme doit créer le nouveau projet. Notez que vous pouvez créer un dépôt privé ou public. Faites en sorte que votre binôme puisse y accéder.

3. Installer et configurer Git sur votre PC
Vous pouvez suivre les explications ici : https://www.atlassian.com/fr/git/tutorials/install-git

4. Cloner votre projet chacun des PCs A l’aide de la commande git clone

5. Ajouter un fichier avec un nom différent à votre projet sur chacun des PCs composé de la ligne python suivante :
print("Hello, World!")

6. Committer tous les 2 votre fichier en local A l’aide des commandes git add et git commit

7. Pusher l’un des 2 commit sur le serveur Gitlab A l’aide de la commande git push

8. Vous ne pouvez pas encore pusher le 2ème commit. Le 2ème membre du binôme fait un pull A l’aide de la commande git pull

9. Pusher le 2ème commit sur le serveur Gitlab

10. L’autre membre peut alors faire un pull. Vous avez maintenant tous les 2 sur vos PC les 2 fichiers ajoutés

11. Modifier tous les 2 le même fichier en remplaçant le message affiché par Hello [votre Prénom]

12. L’un de vous pousse alors la modification sur le serveur après l’avoir commiter

13. Le deuxième fait le commit et puis fait un pull. Vous allez obtenir un conflit. Résolvez le conflit en éditant le fichier en conflit et en enlevant manuellement les <<<<>>>> etc. Ces lignes représentent les lignes en conflits entre vos 2 versions.

14. Faite de nouveau un commit après avoir résolu le conflit, puis push.

15. Récupérer la version courante du serveur chez tout le monde.

16. Créez maintenant une nouvelle branche de développement sur chacun de vos PC (soit à l’aide de l’interface graphique soit en ligne de commande git branch) appelé “dev1” et “dev 2”. N'oubliez pas d’utiliser la commande git checkout dev1 pour vous placer sur la bonne branche

17. Ajouter un nouveau fichier dans votre branche puis commiter et poussez vos changements sur Gitlab

18. Récupérer tout sur l'ensemble des PC du binômes. Les changements apportés par la branche “dev1” sont validés et doivent maintenant être inclus dans la branche master. Faites le nécessaire à l’aide de la commande git merge ...

19. Merger maintenant la branche dev2 dans la branche master

20. Ajouter une nouvelle modification sur le fichier introduit dans la branche dev2, commitez puis pushez.

21. L’autre membre du binôme récupère la dernière version et annule le dernier commit à l’aide de la commande git revert (git reset peut être utilisé si le commit n’a pas été pushé sur le serveur). Réaliser un commit et un push suite à cela.

sudo git revert main~0 (annule le dernier commit de la branche main, dernier = 0, avant dernier = 1 ...etc)

22. Ajouter maintenant un fichier .gitignore à la racine du projet dans la branche master. Ce
fichier doit contenir les lignes suivantes : 
*.c
bin/

23. Récupérer sur le 2ème binôme puis essayer sur chacun des PC d’ajouter un fichier nommé test.c . Que se passe-t-il si vous essayez de le committer?

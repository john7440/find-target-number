# 🎮 Jeu de Devinette en Java

Ce projet est un petit jeu console écrit en Java où le joueur doit deviner un nombre aléatoire entre 1 et 100.
Le jeu donne des indices ("plus haut" ou "plus bas") et permet de rejouer autant de fois qu'on le souhaite.

### 🧠 Fonctionnalités
- Génération **aléatoire** d'un **nombre entre 1 et 100**.
- **Saisie interactive** via la console.
- **Indications** pour guider le joueur.
- **Compteur de tentatives**.
- Option pour **rejouer** une nouvelle partie.
- **Sortie propre** du programme à chaque étape.

### 🚀 Pour lancer le jeu
1. S'assurer d'avoir java installé sur la machine.
2. Compiler le fichier:
   
       javac Game.java
3. Exécuter le jeu:

        java Game

### 📦 Structure du code
- **Scanner** : lire les entrées utilisateur.
- **Random** : pour générer le nombre cible.
- Loop **do/while** : pour permettre plusieurs parties.
- Loop **while** : pour gérer la logique du jeu.

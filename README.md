# Pokédex Java

Un projet Java permettant de gérer un Pokédex avec une interface console (et bientôt graphique avec JavaFX). Ce projet a été développé dans le cadre d’un cours de Structures de Données Avancées.

---

## Fonctionnalités

- 📋 Ajouter, supprimer et rechercher des Pokémon
- 🔍 Recherche par numéro ou nom
- 🗂️ Stockage via `Map` personnalisée
- 🕒 Historique des consultations avec une pile ou une file
- 🌱 Gestion des types de Pokémon (FEU, EAU, PLANTE, etc.)
- 💾 Prévu : persistance JSON
- 🎨 Interface graphique avec JavaFX (en cours)

---

## Technologies utilisées

- Java 17
- Maven
- JavaFX (optionnel)
- JUnit 5 (tests unitaires)
- Architecture MVC

---

## Structure du projet

```
pokedex/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── ch/
│   │           └── heg/
│   │               └── pokedex/
│   │                   ├── business/       # Classes métier (Pokemon, Type)
│   │                   ├── datastructure/  # Stack, Queue, Map personnalisées
│   │                   ├── service/        # Logique métier
│   │                   └── app/            # Main.java
│   └── test/           # Tests unitaires
├── pom.xml
└── README.md
```

---

## À venir

- UI JavaFX avec recherche et affichage visuel
- Persistance avec fichiers JSON ou base de données
- Filtres par génération ou type
- Export CSV ou HTML

---

## Licence

Distribué sous licence MIT.
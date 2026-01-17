# Calendlyo

<p align="center">
  <img src="screenshots/logo.png?raw=true" alt="Calendlyo-AI Logo" width="480">
</p>

<p align="center">
  <strong>Une application moderne de gestion de calendrier et de planification d'événements</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-25-orange?style=flat-square&logo=java" alt="Java 25"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0.0--RC2-green?style=flat-square&logo=spring" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/Bun-1.3.6-black?style=flat-square&logo=bun" alt="Bun"/>
  <img src="https://img.shields.io/badge/Architecture-Hexagonale-blue?style=flat-square" alt="Architecture"/>
</p>

---

## 📋 Table des matières

- [À propos](#à-propos)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Lancement du projet](#lancement-du-projet)
  - [API Backend](#api-backend)
  - [Web App Frontend](#web-app-frontend)
- [Structure du projet](#structure-du-projet)
- [Technologies utilisées](#technologies-utilisées)
- [Contribuer](#contribuer)
- [Licence](#licence)

---

## 🎯 À propos

**Calendlyo** est une application de gestion de calendrier et de planification d'événements, construite avec une architecture hexagonale pour garantir la séparation des préoccupations et la maintenabilité du code.

Le projet est composé de :
- **API Backend** : Spring Boot 4.0 avec Java 25
- **Web App Frontend** : Application web moderne (à venir)

---

## ✅ Prérequis

Avant de commencer, assurez-vous d'avoir installé :

### Pour l'API (Backend)
- **Java 25** (JDK)
  ```bash
  # Vérifier la version
  java -version
  ```
- **Gradle** (ou utiliser le wrapper fourni)

### Pour la Web App (Frontend)
- **Bun** (runtime JavaScript ultra-rapide)
  ```bash
  # Installation avec curl
  curl -fsSL https://bun.sh/install | bash
  
  # Vérifier la version
  bun --version
  ```

---

## 📦 Installation

### Cloner le repository

```bash
git clone https://github.com/M-PROGRAMMATION/Calendlyo.git
cd Calendlyo
```

### Installer les dépendances

#### API Backend
```bash
cd apps/api
./gradlew build
```

#### Web App Frontend
```bash
cd apps/web-app
bun install
```

---

## 🚀 Lancement du projet

### API Backend

L'API utilise une base de données **H2 en mémoire** pour le développement (aucune configuration supplémentaire nécessaire).

#### Option 1 : Avec Gradle Wrapper (recommandé)

```bash
cd apps/api
./gradlew bootRun
```

#### Option 2 : Avec Gradle installé globalement

```bash
cd apps/api
gradle bootRun
```

L'API sera accessible sur : **http://localhost:8080**

---

### Web App Frontend

#### Mode développement

```bash
cd apps/web-app
bun run dev
```

L'application web sera accessible sur : **http://localhost:3000** (ou le port configuré)

#### Build pour production

```bash
cd apps/web-app
bun run build
```

#### Lancer en production

```bash
cd apps/web-app
bun run start
```

---

## 📁 Structure du projet

```
Calendlyo/
├── apps/
│   ├── api/                    # Backend Spring Boot
│   │   ├── src/
│   │   │   └── main/
│   │   │       ├── java/
│   │   │       │   └── com/calendlyo/api/
│   │   │       │       ├── domain/          # Couche domaine
│   │   │       │       ├── application/     # Couche application
│   │   │       │       └── infrastructure/  # Couche infrastructure
│   │   │       └── resources/
│   │   │           └── application.properties
│   │   ├── build.gradle.kts    # Configuration Gradle
│   │   └── gradlew             # Gradle Wrapper
│   │
│   └── web-app/                # Frontend
│       ├── app/
│       ├── public/
│       ├── package.json
│       └── bun.lockb
│
├── README.md                   # Ce fichier
└── LICENSE                     # Licence du projet
```

---

## 🛠️ Technologies utilisées

### Backend (API)
- **Java 25** - Langage de programmation
- **Spring Boot 4.0.0-RC2** - Framework web
- **Spring Data JPA** - ORM et accès aux données
- **H2 Database** - Base de données en mémoire (développement)
- **PostgreSQL** - Base de données
- **Gradle** - Gestionnaire de build
- **Architecture Hexagonale** - Pattern architectural

### Frontend (Web App)
- **Bun** - Runtime JavaScript ultra-rapide
- **Next.js** - Framework React pour le rendu côté serveur

---

## 🔧 Configuration

### Configuration de la base de données

Pour utiliser PostgreSQL, modifiez `apps/api/src/main/resources/application.properties` :

```properties
# PostgreSQL Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/calendlyo
spring.datasource.username=votre_username
spring.datasource.password=votre_password
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
```

### Variables d'environnement

Créez un fichier `.env` à la racine de chaque application pour configurer les variables d'environnement :

#### API Backend (.env)
```
SPRING_PROFILES_ACTIVE=dev
DATABASE_URL=jdbc:postgresql://localhost:5432/calendlyo
DATABASE_USERNAME=username
DATABASE_PASSWORD=password
```

#### Web App Frontend (.env)
```
NEXT_PUBLIC_API_URL=http://localhost:8080
```

---

## 🤝 Contribuer

Les contributions sont les bienvenues ! Voici comment contribuer :

1. **Fork** le projet
2. Créez votre branche de fonctionnalité (`git checkout -b feature/slug`)
3. Committez vos changements (`git commit -m 'feat: add amazing feature'`)
4. Push vers la branche (`git push origin feature/slug`)
5. Ouvrez une **Pull Request**

### Normes de code

- Suivre les conventions Java standard pour le backend
- Utiliser des noms de variables et méthodes explicites
- Commenter le code complexe
- Écrire des tests unitaires pour les nouvelles fonctionnalités

---

## 📝 Licence

Ce projet est sous licence **MIT**. Voir le fichier [LICENSE](LICENSE) pour plus de détails.

---

## 👥 Auteurs

- **M-PROGRAMMATION** - Développeur principal

---

## 📧 Contact

Pour toute question ou suggestion :
- **Email** : m.programmation31@gmail.com
- **GitHub** : [@M-PROGRAMMATION](https://github.com/M-PROGRAMMATION)

---

<p align="center">
  Fait avec ❤️ et bénévolement par M-PROGRAMMATION
</p>


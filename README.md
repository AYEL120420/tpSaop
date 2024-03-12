# coliss-soap-ws

## Installation et démarrage

Avant de commencer, assurez-vous d'avoir les éléments suivants installés sur votre système :

- Java Development Kit (JDK version 17 ou ultérieure) et Maven (version 3 ou ultérieure)
- Un environnement de développement intégré (IDE) tel qu'Eclipse, IntelliJ IDEA ou NetBeans (facultatif, mais recommandé)

## Lancement depuis un IDE

La classe à lancer est `GestacheServicePublisher.java`, elle se trouve dans le répertoire `src/main/java/eu/fr/insee/formation/business/service/publisher/` du projet.

### Étapes pour lancer depuis un IDE :

1. **Ouvrir l'IDE** : Lancez votre environnement de développement intégré (IDE) préféré.

2. **Importer le projet** : Importez le projet Gestache dans votre IDE, s'il n'est pas déjà importé.

3. **Rechercher la classe** : Recherchez le fichier `GestacheServicePublisher.java` dans la structure du projet.

4. **Exécuter la classe** : Cliquez avec le bouton droit de la souris sur le fichier `GestacheServicePublisher.java`, puis sélectionnez l'option pour l'exécuter en tant qu'application Java. Cette option peut varier selon l'IDE que vous utilisez, mais elle sera généralement quelque chose comme "Run As" > "Java Application" dans Eclipse ou "Run" > "Run 'GestacheServicePublisher'" dans IntelliJ IDEA.

La classe `GestacheServicePublisher.java` est une classe Java qui publie des services web à l'aide de l'API JAX-WS (`javax.xml.ws.Endpoint`). Ces services sont publiés à des URL spécifiques sur un serveur en utilisant la méthode `publish` de la classe `Endpoint`. Elle est responsable de la publication des services web pour la gestion des utilisateurs et des alertes de l'application Gestache.

## Guide de création de projet sur SOAP UI

Ce guide vous aidera à créer un nouveau projet sur SOAP UI pour tester des services web SOAP.

### Prérequis

Avant de commencer, assurez-vous d'avoir installé SOAP UI sur votre machine. Vous pouvez le télécharger depuis [le site officiel de SOAP UI](https://www.soapui.org/downloads/soapui.html).

### Étapes

1. **Lancer SOAP UI :** Lancez l'application SOAP UI depuis votre menu d'applications ou en exécutant le fichier exécutable.

2. **Créer un nouveau projet :** 

   - Cliquez sur "File" (Fichier) dans la barre de menu supérieure.     
	 
   - Sélectionnez "New SOAP Project".
	    
   ![Interface SOAP UI : New SOAP Project](scrennshots/new-soapui-project.png)
		
	
   - Entrez le nom de votre projet et l'URL du WSDL. Vous pouvez également importer un fichier WSDL placé dans le répertoire `wsdl` du projet : 
	
   ![Interface SOAP UI : New SOAP Project](scrennshots/define-project-params.png)
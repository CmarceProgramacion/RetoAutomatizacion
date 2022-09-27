### `Reto De Automatización de pruebas Web`

#### Descripción

Proyecto de Automatización de alertas JavaScript, Iframes y múltiples ventanas usando JAVA y Serenity BDD

#### Feature: validate that the alerts

> **As** an automator

> **I** want to use javaScript alerts

> **To** validate its functionality

#
#### Feature: Validate changes to a text in the editor

> **As** an automator

> **I** want to access the editor to write a text and change its formatting

> **To** verify the changes written in the editor

#
#### Feature: Validate the content of multiple windows
> **As** an automator

> **I** want to open multiple windows

> **To** verify their content

#### Características del Proyecto

En la construcción del proyecto de automatizacion web en la plataforma Herokuapp se implementa:

- Patrón de diseño de Screemplay.
- Framework SerenityBDD.
- Gestor de paquetes Gradle.
- Desarrollado en java en su versión 8

#### Versionado

| Repository       | Version |
|------------------|---------|
| Serenity         | 3.3.4   |
| SerenityCucumber | 3.3.4   |
| SerenityEnsure   | 3.2.5   |
| Slf4jSimple      | 1.7.36  |
| Junit            | 4.13.2  |

#### Precondiciones

- [x] 1: Instar Java en su versión 8.
- [x] 1.1: Configurar variable de entorno JAVA_HOME
- [x] 2: Instar Gradle en su versión 7.2
- [x] 2.1: Configurar variable de entorno GRADLE_HOME
- [x] 3: Para ejecutar Edge se debe usar el parametro comentado en serenity.properties:
  - webdriver.driver=edge


#### Ejecución del proyecto

Para la ejecución del proyecto se debe implementar el siguiente comando en el terminal en el directorio raíz del proyecto:

```sh
gradle clean test -Denvironment=stg
```


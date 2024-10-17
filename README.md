[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/58TiBSsz)

## Authors

- Alessia Intini (s309895)
- Antonio Iorio (s317748)
- Matteo Tedesco (s319816)
- Margherita Lavena (s313642)

## Project structure

* `./`: the main directory contains the documents readme
* `ANALYTICS/`: is the folder that contains the implementation of the ANALYTICS microservice. It runs on 8087 port
* `COOMUNICATION_MANAGER/`: is the folder that contains the implementation of the COMMUNCATION_MANAGER microservice.
  It runs on 8081 port
* `CRM`: is the folder that contains the implementation of the CRM microservice It runs on 8083 port
* `DOCUMENT_STORE`: is the folder that contains the implementation of the DOCUMENT_STORE microservice. It runs on 8084
* `IAM`: is the folder that contains the implementation of the IAM microservice. It runs on 8080 port
* `IAM/iam_keycloak-data`: contains the iam information that needs to be imported to the docker volume,
  where the following are configured: roles and user.
    * Roles:
        * __admin__: has all the permissions
        * __operator__: has the permission to read and write using all microservices
        * __guest__: has the permission to read all microservices except for messages
    * Users:
        * __admin__:
            * username: admin
            * password: password
        * __operator__:
            * username: operator
            * password: password
        * __manager__:
            * username: manager
            * password: password

* `jobplacement-fe`: is the folder that contains the implementation of the frontend
* `logger-centralization`: is the folder that contains the configuration to run grafana, loki and prometheus as a
  service:

# TODO List API

## Descrição do projeto
--- 
Nesse projeto foi desenvolvido uma API para comunicação com um TODO List (listas de tarefas). 

## Funcionalidades
---
- Cadastrar novas atividades 
- Listar todas as atividades cadastradas
- Pesquisas aividades pelo id
- Atualizar atividades
- Remover atividades cadastradas

## Como utilizar a API
---
1. Baixe o repositório e configure o banco de dados de acordo com sua preferência. projeto foi feito com Spring Boot (já vem com tomcat), de tal modo que não precisa configurar um servidor local, basta configurar o banco de dados. Para isso dois arquivos devem ser alterados:
   - pom.xml: adicionar a dependência referente ao BD que utilizará.
   - Configurar o JPA (aplication.properties): localizado em src/main/resources/

## Tecnologias utilizadas
--- 
- Java
- Maven
- Spring boot
- postgreSQL

## Tarefas em aberto
---
- Tratar os erros que são enviados quando o cliente faz uma requisição inválida

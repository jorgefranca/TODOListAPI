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
1. Baixe o repositório e configure o banco de dados de acordo com sua preferência
2. O projeto foi feito com Spring Boot, de tal modo que não precisa configurar um servidor local, basta configurar o banco de dados. Para isso dois arquivos devem ser alterados dois arquivos:
   - pom.xml: deve ser incluida a dependência referente ao BD que utilizara.
   - aplication.properties: localizado em src/main/resources/

## Tecnologias utilizadas
--- 
- Java
- Maven
- Spring boot
- postgreSQL

## Tarefas em aberto
---
- Tratar os erros que são enviados quando o cliente faz uma requisição inválida

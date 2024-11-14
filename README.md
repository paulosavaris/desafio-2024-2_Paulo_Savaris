# Desafio TI DEV UNOESC 2024/2
CORREDPONDENTE AO EDITAL N. 79/UNOESC-R/2024

Desafio Programador Fullstack Unoesc - Java
Esse é o nosso desafio para a vaga de programador Fullstack Java na Unoesc. Serão testadas as habilidades e qualidade de código ao transformar requisitos limitados em uma aplicação web.
Faça o *FORK* deste repositório e implemente o desafio.

## DESAFIO
Você terá que desenvolver uma aplicação web responsável por consumir e registrar produtos aleatórios, individualmente, complementando as informações através da consulta de uma API e os apresentando em um mural, no estilo marketplace.

## ESCOPO DO DESAFIO

**_Entidade PRODUCT_**

Deverá ter as seguintes informações preenchidas MANUALMENTE pelo usuário:
* "name" - String
* "category" - Relacionamento com a classe Category
* "brand" - Relacionamento com a classe Brand
* "active" - boolean

Deverá possuir as seguintes informações VINDAS da API **https://dummyjson.com/products/{id}**:
* "description" - Srtring
* "price" - Double
* "rating" - Double
* "stock" - Double
* "sku" - String
* "weight" - Double

**_Entidade CATEGORY_**

Deverá ter as seguintes informações preenchidas manualmente pelo usuário:
* "name" - String
* "active" - boolean

**_Entidade BRAND_**

Deverá ter as seguintes informações preenchidas manualmente pelo usuário:
* "name" - String
* "active" - boolean
* "mail" - String
* "phone" - Long

Para auxíliar na construção, um modelo ER resumido.
![Captura de tela 2024-11-14 075214](https://github.com/user-attachments/assets/dbad1764-73e5-4486-887f-8e5f95882d4a)

**Regras de Negócio**
1. Ao adicionar um novo **PRODUCT**, o usuário deverá informar os parâmetros manuais. Ao persistir o registro, as demais informações supracitadas deverão ser consultadas e salvas à partir dos dados da API.
2. No caso de edição de um **PRODUCT**, o usuário deve ser liberado para alterar os dados livremente.
3. Deve haver uma opção para ressincronizar os dados do **PRODUCT**, à partir da API novamente, alterando apenas os dados os quais condiz.
4. Deve existir um relacionamento entre **PRODUCT** com uma **CATEGORY** e uma **BRAND**, onde um produto pode ter uma categoria e uma marca.
5. Apenas deve ser possivel associar **PRODUCT** a uma **CATEGORY** em que o parâmetro "active", seja TRUE.
6. Apenas deve ser possivel associar **PRODUCT** a uma **BRAND** em que o parâmetro "active", seja TRUE.
7. Não deve ser possível excluir **CATEGORY** e **BRAND** que possua um ou mais **PRODUCT** associado.
8. Não deve ser possível inserir um **PRODUCT**, **CATEGORY** ou **BRAND** idêntico a outro já existente (desconsiderando seu id).
9. O sistema deverá permitir buscar todos os **PRODUCT** (ativos) armazenados em sua base, filtrando por "name", **BRAND** (ativas) ou **CATEGORY** (ativas), apresentando-os em um mural, onde os registros serão dispostos em cards que contenham as informações armazenadas, de maneira organizada.
10. Todos os campos que necessitem de máscara, devem a ter implementada.
11. A aplicação deve ser protegida por um login. Porém, não é necessário que exista uma tela para cadastro de usuários.

## TECNOLOGIAS OBRIGATÓRIAS
* Java 17+;
* Spring Boot;
* Maven;
* Thymeleaf;
* MySQL 5.7.X+;
* GIT;

Para auxiliar no setup inicial do projeto, você pode utilizar o <a href="https://start.spring.io/">Spring Initializr</a>

## AVALIAÇÃO
O código será avaliado de acordo com os seguinte critérios:

* Estrutura do projeto
* Build e execução da aplicação;
* Completude das funcionalidades;
* Qualidade de código (design pattern, manutenibilidade, clareza);
* Histórico do GIT;
* Boas práticas de UI (Interface com o Usuário);
* Sentido e coerência nas respostas aos questionamentos na entrevista de apresentação do desafio realizada pelo candidato.

*** Não esqueça de documentar o processo necessário para rodar a aplicação.

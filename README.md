# Desafio TI DEV UNOESC 2024/2
CORREDPONDENTE AO EDITAL N. 79/UNOESC-R/2024

Desafio Programador Fullstack Unoesc - Java
Esse é o nosso desafio para a vaga de programador fullstack Java na Unoesc. Serão testadas as habilidades e qualidade de código ao transformar requisitos limitados em uma aplicação web.
Faça o *FORK* deste repositório e implemente o desafio.

## DESAFIO
Você terá que desenvolver uma aplicação web responsável por consumir e registrar personagens aleatórios da franquia Star Wars, com seu respectivo planeta natal, em seu banco de dados.
Para tal, deverá ser feito uso da API "https://www.swapi.tech/", associando o personagem criado a seu respectivo planeta (que também deverá ser consumido da API).

## ESCOPO DO DESAFIO
O cadastro da entidade CHARACTER, deverá conter as seguintes informações vindas da api https://www.swapi.tech/api/people/{x}:
* "name"
* "gender"
* "height"
* "homeworld"
* "created"

O cadastro da entidade PLANET, deverá conter as seguintes informações vindas da api https://www.swapi.tech/api/planets/{x}:
* "name"
* "diameter"
* "population"
* "climate"
* "created"

Ao adicionar um novo personagem, todas as informações deverão vir aleatoriamente da API, exceto a informação "updated" e as chaves primárias dos registros em seu banco de dados. Assim, é necessário haver a correlação entre PERSONAGEM e PLANETA.
Deve ser possível, inserir, editar e excluir personagens. Sendo que ao editar, deverão ser consultadas novamente as informações da API e o campo "updated", deverá ser preenchido com a data da edição.
Não deve ser possível inserir um personagem já existente em sua base.
Não deve ser possível inserir um planeta já existente em sua base.
O sistema deverá permitir buscar todos os personagens armazenados em sua base, filtrando por PLANETA, apresentando-os em um mural, onde os registros serão dispostos em cards que contenham as informações armazenadas, de maneira organizada.
A aplicação deve ser protegida por um login. Porém, não é necessário que exista uma tela para cadastro de usuários.

## TECNOLOGIAS OBRIGATÓRIAS
* Java;
* Spring Boot;
* Maven;
* Thymeleaf;
* MySQL 5.7.X;
* GIT;

## AVALIAÇÃO
O código será avaliado de acordo com os seguinte critérios:

* Build e execução da aplicação;
* Completude das funcionalidades;
* Qualidade de código (design pattern, manutenibilidade, clareza);
* Histórico do GIT;
* Boas práticas de UI (Interface com o Usuário);
* Sentido e coerência nas respostas aos questionamentos na entrevista de apresentação do desafio realizada pelo candidato.

*** Não esqueça de documentar o processo necessário para rodar a aplicação.

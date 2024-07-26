# Pet One (Back-end)

Este repositório contém o código **back-end** do projeto **Pet One**.

## Sumário

- [Descrição](#descrição)
- [Tecnologias](#tecnologias)
- [Pré-requisitos](#pré-requisitos)
- [Configuração do Ambiente](#configuração-do-ambiente)
- [Testes](#testes)
- [Autores](#autores)
- [Repositório Front-end](#repositório-front-end)

## Descrição

Trabalho academico do 4º período do curso de Engenharia de Software.
PetOne é um sistema completo de integração de dados veterinários como consultas, exames, vacinas e medicamentos para que o tutor ou outros veterinários possam ter acesso a todo histórico dos animais, composto por um back-end robusto desenvolvido em Spring Boot e um front-end interativo desenvolvido em Angular. O back-end fornece APIs RESTful para operações CRUD (Create, Read, Update, Delete), JPQL e integração com um banco de dados MySQL, enquanto o front-end oferece uma interface de usuário amigável para interagir com essas APIs.

## Tecnologias

- Java
- Spring Boot
- MySQL
- JPA/Hibernate
- Maven
- JUnit
- Mockito
- JaCoCo

## Pré-requisitos

- [JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/)

## Configuração do Ambiente

1. **Clone o repositório:**

   ```sh
   git clone https://github.com/NandaMerino/PetOne.git
   cd PetOne
   ```
   
2. **Configuração do Banco de Dados:**
   
   Certifique-se de ter o MySQL instalado e em execução. Crie um banco de dados chamado `petOne`.
   
   ```sh
   CREATE DATABASE petOne;
   ```

3. **Configuração do Application Properties:**
   
   Edite o arquivo `src/main/resources/application.properties` para configurar as propriedades do banco de dados:
   
   ```sh 
   spring.datasource.url=jdbc:mysql://localhost:3306/petOne
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
   ```
4. **Compilação e Execução:**

   Compile e execute a aplicação usando Maven:

   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

5. **Acesso à API:**

   A API estará disponível em http://localhost:8080/api.

## Testes

- **Unitários e de Integração:** Os testes unitários e de integração são implementados utilizando JUnit e Mockito.
- **Cobertura de Código:** A cobertura de código é gerada utilizando JaCoCo.


## Autores

- **Bruno Vieira Nobre** - [Bruno Vieira Nobre](https://github.com/BrunoV7)
- **Fernanda Merino** - [NandaMerino](https://github.com/NandaMerino)
- **Guilherme Cunha** - [Guilherme Cunha](https://github.com/guilhermecunhadacruz)
- **Pedro Henrique Roratto** - [Pedro Henrique Roratto](https://github.com/rorxtto)
- **Rafael Alves de Oliveira** - [Rafael Alves de Oliveira](https://github.com/rafascript)


## Repositório Front-end

- [Pet One](https://github.com/NandaMerino/PetOneFront)

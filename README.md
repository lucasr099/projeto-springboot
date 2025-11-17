# Projeto Spring Boot

Este é um projeto desenvolvido com **Spring Boot**, utilizando **Java**, **H2 Database**, **JPA/Hibernate** e testes via **Postman**.

O objetivo é demonstrar a estrutura básica de uma API REST completa, organizada em camadas (Controller, Service, Repository), com tratamento de exceções e integração com banco de dados em memória.

---

## 🚀 Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot** (Web, JPA, Validation)
* **H2 Database**
* **Maven**
* **Hibernate**
* **Postman** (para testes)

---

## 📁 Estrutura do Projeto

```
src/
 └── main/
     ├── java/
     │    └── ... (código fonte da aplicação)
     └── resources/
          ├── application.properties
          └── data.sql (opcional para carga inicial)
```

A aplicação segue o padrão:

* **Controller:** recebe requisições e retorna respostas
* **Service:** regras de negócio
* **Repository:** acesso ao banco (JPA)
* **Entities:** modelos persistidos
* **Exceptions:** tratamento personalizado de erros

---

## 🗂️ Endpoints Principais

*(Adapte esta seção conforme seus endpoints reais)*

### **GET /users** — Lista todos os usuários

### **GET /users/{id}** — Busca um usuário específico

### **POST /users** — Cria um novo usuário

### **PUT /users/{id}** — Atualiza um usuário

### **DELETE /users/{id}** — Remove um usuário

Todos os endpoints foram testados usando **Postman**.

---

## 🛠️ Configuração do Banco H2

A aplicação utiliza banco em memória H2 para facilitar testes.

Acesse o console do H2 em:

```
http://localhost:8080/h2-console
```

Credenciais padrão (podem mudar conforme seu application.properties):

```
jdbc:h2:mem:testdb
user: sa
password:
```

---

## ⚠️ Tratamento de Exceções

O projeto possui tratamento global de erros usando `@ControllerAdvice`, garantindo retornos padronizados para:

* Recurso não encontrado (404)
* Erro de banco (400)
* Erros de validação

---

## ▶️ Como Rodar o Projeto

```bash
mvn spring-boot:run
```

Ou execute a classe principal:

* `ProjetoSpringbootApplication.java`

---


## 📌 Autor

Projeto desenvolvido por **Lucas Costa**.

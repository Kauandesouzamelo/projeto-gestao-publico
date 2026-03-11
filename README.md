# Sistema de Gestão de Produção de Calças

API backend desenvolvida em **Java** com **Spring Boot** para gerenciamento de produção e controle de informações de uma confecção familiar.

O sistema foi criado para resolver uma necessidade real da empresa da minha família: organizar e centralizar dados de produção que antes eram controlados manualmente.

---

## Objetivo do Projeto

Este projeto tem como objetivo automatizar e melhorar o controle de produção da empresa, permitindo registrar e gerenciar informações importantes do processo produtivo.

Com esta API é possível:

* Registrar dados relacionados à produção
* Organizar informações do processo produtivo
* Centralizar dados em um banco de dados na nuvem
* Disponibilizar uma API para futuras integrações com aplicações web ou mobile

---

## Tecnologias Utilizadas

### Backend

* Java
* Spring Boot

### Banco de Dados

* PostgreSQL
* Supabase

### Infraestrutura

* Docker
* Render (deploy em cloud)

### Versionamento

* Git
* GitHub

---

## Arquitetura do Projeto

A aplicação segue uma arquitetura padrão de APIs REST utilizando Spring Boot.

Estrutura principal do projeto:

src
├── controller
├── service
├── repository
├── model
└── config

Essa separação de camadas facilita a manutenção, organização do código e futuras evoluções do sistema.

---

## Deploy da Aplicação

A API está hospedada na nuvem utilizando Render.

Link da aplicação:

https://projeto-gestao-publico.onrender.com

O deploy é realizado utilizando Docker, garantindo consistência entre ambientes de desenvolvimento e produção.

---

## Banco de Dados

O banco de dados utilizado é PostgreSQL hospedado no Supabase.

A conexão com o banco é configurada utilizando variáveis de ambiente para manter as credenciais seguras.

Exemplo de configuração:

spring.datasource.url=${SPRING_DATASOURCE_URL}
spring.datasource.username=${SPRING_DATASOURCE_USERNAME}
spring.datasource.password=${SPRING_DATASOURCE_PASSWORD}

---

## Como Rodar o Projeto Localmente

1. Clone o repositório:

git clone https://github.com/Kauandesouzamelo/projeto-gestao-publico.git

2. Entre na pasta do projeto:

cd producao-calcas

3. Execute a aplicação:

mvn spring-boot:run

A aplicação será iniciada em:

http://localhost:8080

---

## Melhorias Futuras

* Implementação de autenticação e autorização
* Documentação automática da API com Swagger
* Monitoramento da aplicação
* Criação de interface frontend para gestão da produção
* Melhorias na estrutura de logs da aplicação

---

## Autor

Kauan de Souza Melo

Desenvolvedor Backend em formação, estudante de Análise e Desenvolvimento de Sistemas com foco em desenvolvimento de APIs e aplicações backend com Java.

GitHub:
https://github.com/Kauandesouzamelo

LinkedIn:
(https://www.linkedin.com/in/kauandesouzamelo/)

---

## Licença

Este projeto foi desenvolvido para fins educacionais e também para auxiliar na gestão da empresa da minha família.

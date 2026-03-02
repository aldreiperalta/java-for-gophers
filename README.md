# ☕ Java para Gophers & Data Scientists

Este repositório é um guia prático de transição para o **Java 21**, estruturado como um livro de estudos para desenvolvedores que já dominam **Go** e **R**. 

O foco aqui não é o básico de lógica, mas sim a arquitetura corporativa, performance com Spring Boot e o novo modelo de concorrência.

---

## 📖 Sumário (Capítulos)

### 📂 Parte 1: O Choque Cultural
* **Capítulo 1:** [Fundamentos: Tipagem, Records e Interfaces](./docs/01-fundamentos.md)
* **Capítulo 2:** [Minha Primeira API: Spring Boot na Prática](./docs/02-primeira-api.md)

### 📂 Parte 2: Engenharia de Performance
* **Capítulo 3:** [Concorrência: Virtual Threads vs Goroutines](./docs/03-virtual-threads.md)

---

## 📌 Mapa de Equivalência (Consulta Rápida)

Para facilitar a mudança de "chip" mental, use esta tabela como referência:

| Conceito | Go (Gopher) | R (Data Science) | Java 21 (Moderno) |
| :--- | :--- | :--- | :--- |
| **Entidade de Dados** | `struct` | `data.frame` (row) | `record` |
| **Contratos/Abstração**| `interface` (implícita) | `S3/S4 Methods` | `interface` (explícita) |
| **Coleções Dinâmicas** | `slice` | `vector` | `List` |
| **Dicionários** | `map[K]V` | `list` (named) | `Map<K, V>` |
| **Multithreading** | `goroutines` | N/A (Parallel) | `Virtual Threads` |
| **Tratamento de Erro** | `if err != nil` | `tryCatch()` | `try-catch` (Exceptions) |

---

## 🛠️ Requisitos do Ambiente
* **JDK:** Java 21 (LTS) - *Recomendado: Amazon Corretto ou Temurin*
* **IDE:** IntelliJ IDEA (Community ou Ultimate)
* **Build Tool:** Maven 3.9+

---
*Documentação criada por [aldreiperalta] para fins de estudo e consulta futura.*

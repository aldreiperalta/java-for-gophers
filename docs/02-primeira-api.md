# 🚀 Capítulo 2: Minha Primeira API com Spring Boot

Neste capítulo, transformamos lógica de console em um serviço web.

## 1. O Conceito de Controller
Enquanto no **Go** você define rotas manualmente no `main`, no Java usamos **Classes Controller**. Elas separam a lógica de "quem pede" (cliente/navegador) de "quem faz" (sua lógica de negócio).

## 2. Automatização com Anotações
As anotações (começadas com `@`) são "super-poderes" que adicionamos às classes. 
* `@RestController`: Transforma a classe em um servidor web.
* `@GetMapping`: Cria o link (endpoint) que o usuário acessa.

## 3. Resultado Esperado
Ao rodar o projeto e acessar `http://localhost:8080/api/produtos`, o navegador exibirá os dados em formato JSON, exatamente como o processamento que fizemos no Capítulo 1.

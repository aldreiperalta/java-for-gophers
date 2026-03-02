# ☕ Java para Gophers & Data Scientists

Este repositório é um guia prático de transição para o Java 21, focado em desenvolvimento corporativo e sistemas de alta performance.

## 📌 Mapa de Equivalência (Consulta Rápida)

| Conceito | Go (Gopher) | R (Data Science) | Java 21 (Moderno) |
| :--- | :--- | :--- | :--- |
| **Entidade de Dados** | `struct` | `data.frame` (row) | `record` |
| **Contrato** | `interface` (implícita) | `S3/S4 Methods` | `interface` (explícita) |
| **Coleções** | `slice` / `map` | `list` / `vector` | `List` / `Map` / `Stream` |
| **Concorrência** | `goroutines` | N/A (Native) | `Virtual Threads` (Loom) |
| **Tratamento Erro** | `if err != nil` | `tryCatch()` | `try-catch` (Exceptions) |

---

## 🚀 Módulo 1: O Ecossistema Spring Boot

Para criar uma API em Java, não subimos um servidor na mão como no Go. Usamos o **Spring Boot**, que é o padrão ouro para empresas.

### Primeiro Endpoint (Hello World)
```java
@RestController
public class HelloController {
    @GetMapping("/welcome")
    public Map<String, String> hello() {
        return Map.of("message", "Bem-vindo ao Java, Gopher!");
    }
}

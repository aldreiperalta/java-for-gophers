# 🚀 Capítulo 2: Minha Primeira API: Spring Boot na Prática

Neste capítulo, criamos um endpoint real para entender como o Java entrega JSON de forma eficiente.

### O Código do Controller
```java
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class WelcomeController {
    @GetMapping("/status")
    public Map<String, String> getStatus() {
        return Map.of("status", "UP", "language", "Java 21");
    }
}

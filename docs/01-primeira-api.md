# 🚀 Capítulo 2: Sua Primeira API com Spring Boot

Agora que o ambiente está pronto, vamos subir um endpoint REST que retorna um JSON, similar ao que faríamos com `net/http` no Go.

### Passo a Passo
1. **Extração:** Extraia o `.zip` do Spring Initializr.
2. **IDE:** Abra a pasta no **IntelliJ IDEA**.
3. **Criação:** Em `src/main/java/com/exemplo/demo/`, crie o arquivo `WelcomeController.java`.

### O Código (Padrão DTO com Map)
```java
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
public class WelcomeController {

    @GetMapping("/status")
    public Map<String, Object> getStatus() {
        // No Java, usamos .put() para dicionários (Maps)
        Map<String, Object> status = new HashMap<>();
        status.put("status", "UP");
        status.put("language", "Java 21");
        status.put("paradigm", "Multiparadigm (OO + Functional)");
        status.put("engine", "Spring Boot 3");
        return status;
    }
}

---

### Por que fazer assim?
1. **Navegação:** Quem visitar seu GitHub verá um README limpo e clicará no "Capítulo 2" para ler o tutorial.
2. **Organização Profissional:** Grandes projetos (como o próprio Spring ou Kubernetes) usam essa estrutura de pastas de documentação separadas do código.

**Dica para o próximo passo:** No seu computador, dentro da pasta do projeto Java, você verá uma pasta chamada `src`. O código de verdade (o arquivo `.java`) deve morar lá para você poder rodar. No GitHub, você apenas **documenta** o que fez nesses arquivos Markdown.

**Quer que eu te ajude a criar o link dentro do README para que ele aponte direto para essa nova página de documentação?**

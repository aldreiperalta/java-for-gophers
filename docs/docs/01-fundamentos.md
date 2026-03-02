# 📓 Capítulo 1: Fundamentos, Records e Interfaces

Vindo do Go e do R, o Java 21 traz recursos que reduzem drasticamente o "boilerplate" (código repetitivo).

### 1. Records (As Structs do Java)
Diferente das classes antigas, os `records` são imutáveis e já trazem métodos como `toString()` e `equals()` automáticos.
- **Go:** `type User struct { Name string }`
- **Java:** `public record User(String name) {}`

### 2. Interfaces e Contratos
Em Java, a implementação é explícita usando `implements`. Isso ajuda muito em projetos grandes para saber quem está cumprindo qual contrato no sistema.

### 3. Tipagem Forte
O Java não deixa você "improvisar". Se um método espera um `Integer`, você não pode passar um `Long` sem converter. Isso evita muitos bugs de produção que o R às vezes deixa passar.

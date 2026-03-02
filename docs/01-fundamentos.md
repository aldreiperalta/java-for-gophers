# 📓 Capítulo 1: Fundamentos, Records e Interfaces

Neste capítulo, exploramos a base do Java 21. O foco é entender a tipagem forte e as estruturas que substituem as `structs` do Go e os `data.frames` do R.

## 1. Variáveis e Tipagem (O "var" moderno)
Embora o Java seja fortemente tipado, desde o Java 10 podemos usar o `var` para inferência de tipos em variáveis locais, similar ao `:=` do Go.

* **Java:** `var nome = "Gopher";` (O compilador entende que é String).
* **Go:** `nome := "Gopher"`

## 2. Records: As novas "Structs"
Em Go, usamos `structs` para dados. No Java antigo, usávamos classes pesadas com Getters e Setters. No Java 21, usamos **Records**. Eles são imutáveis e vêm com métodos prontos.



### Exemplo de Comparação:
**Em Go:**
```go
type User struct {
    ID   int
    Name String
}


## 📊 O "Jeito R" de manipular dados no Java
Vindo do R, você está acostumado com o `pipe` (`%>%`). No Java 21, usamos a **Streams API** para processar coleções de forma funcional.

| Operação | R (dplyr) | Java (Streams) |
| :--- | :--- | :--- |
| Filtrar | `filter(df, x > 10)` | `.filter(x -> x > 10)` |
| Transformar | `mutate(df, y = x * 2)` | `.map(x -> x * 2)` |
| Selecionar | `select(df, col1)` | `.map(User::name)` |
| Agrupar | `group_by(col1)` | `.collect(Collectors.groupingBy(...))` |

---

## 🏗️ Estrutura de Pastas de um Projeto Java Professional
Ao contrário do Go, onde a estrutura é flexível, o Java segue o padrão **Maven**:
- `src/main/java`: Onde mora o seu código `.java`.
- `src/main/resources`: Configurações (`application.properties`) e arquivos estáticos.
- `src/test/java`: Onde você DEVE escrever seus testes (JUnit).
- `pom.xml`: O "cérebro" do projeto (equivalente ao `go.mod`).

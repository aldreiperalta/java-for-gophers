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

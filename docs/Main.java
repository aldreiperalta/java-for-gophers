package fundamentos;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Usando Records (Imutabilidade estilo Go)
        record Produto(String nome, double preco) {}

        List<Produto> listaDeProdutos = List.of(
            new Produto("Laptop", 4500.0),
            new Produto("Mouse", 150.0),
            new Produto("Monitor", 1200.0)
        );

        // 2. Usando Streams (Estilo funcional do R)
        var produtosCaros = listaDeProdutos.stream()
            .filter(p -> p.preco() > 1000)
            .map(Produto::nome)
            .collect(Collectors.joining(", "));

        System.out.println("Produtos Premium: " + produtosCaros);
    }
}

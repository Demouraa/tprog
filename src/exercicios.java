import java.util.*;
import java.util.stream.Collectors;

public class exercicios {

    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
    }

    // =====================================================
    // Exercício 1 - Filtragem Simples
    // =====================================================
    private static void exercicio1() {
        System.out.println("=== Exercício 1 ===");
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        numeros.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);

        System.out.println();
    }

    // =====================================================
    // Exercício 2 - Mapeamento
    // =====================================================
    private static void exercicio2() {
        System.out.println("=== Exercício 2 ===");
        List<String> nomes = List.of("ana", "bruno", "carla");

        nomes.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);

        System.out.println();
    }

    // =====================================================
    // Exercício 3 - Ordenação e Limite
    // =====================================================
    private static void exercicio3() {
        System.out.println("=== Exercício 3 ===");
        List<Double> numeros = List.of(9.5, 2.3, 5.1, 1.9, 4.0);

        numeros.stream()
               .sorted()
               .limit(3)
               .forEach(System.out::println);

        System.out.println();
    }

    // =====================================================
    // Exercício 4 - Redução
    // =====================================================
    private static void exercicio4() {
        System.out.println("=== Exercício 4 ===");
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        int soma = numeros.stream()
                          .reduce(0, Integer::sum);

        System.out.println("Soma total: " + soma);
        System.out.println();
    }

    // =====================================================
    // Exercício 5 - Desafio Avançado (Pipeline Composto)
    // =====================================================
    private static void exercicio5() {
        System.out.println("=== Exercício 5 ===");

        List<Produto> produtos = List.of(
            new Produto("Notebook", 3500, "Eletrônicos"),
            new Produto("Fone Bluetooth", 600, "Eletrônicos"),
            new Produto("Teclado", 300, "Eletrônicos"),
            new Produto("Cadeira Gamer", 800, "Móveis"),

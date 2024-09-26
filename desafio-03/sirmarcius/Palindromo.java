// Desafio03 - Palindromo / Autor: Márcio Gusmão / 2024

import java.util.ArrayList;

public class Palindromo {
    private ArrayList<String> palavras;

    // Construtor
    public Palindromo() {
        palavras = new ArrayList<>();
    }

    // Método para verificar se uma string é um palíndromo
    public static boolean isPalindromo(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Adiciona uma nova palavra na lista
    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    // Lista todas as palavras
    public void listarPalavras() {
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }

    // Verifica e imprime se cada palavra na lista é um palíndromo
    public void verificarPalindromos() {
        for (String palavra : palavras) {
            if (isPalindromo(palavra)) {
                System.out.println("\"" + palavra + "\" é um palíndromo.");
            } else {
                System.out.println("\"" + palavra + "\" não é um palíndromo.");
            }
        }
    }

    public static void main(String[] args) {
        Palindromo listaPalavras = new Palindromo();

        // Adicionando palavras na lista
        listaPalavras.adicionarPalavra("radar");
        listaPalavras.adicionarPalavra("ovo");
        listaPalavras.adicionarPalavra("ana");
        listaPalavras.adicionarPalavra("arara");
        listaPalavras.adicionarPalavra("rir");
        listaPalavras.adicionarPalavra("salas");
        listaPalavras.adicionarPalavra("redivider");

        // Listando todas as palavras
        System.out.println("Palavras na lista:");
        listaPalavras.listarPalavras();

        // Verificando cada palavra se é um palíndromo
        System.out.println("\nVerificação de palíndromos:");
        listaPalavras.verificarPalindromos();
    }
}

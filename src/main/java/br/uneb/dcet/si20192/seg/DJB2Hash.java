package br.uneb.dcet.si20192.seg;

import java.util.Scanner;

/**
 * Classe que implementa o algoritmo de hash DJB2.
 *
 * <p>
 * O hash DJB2, formulado pelo Professor Daniel J. Bernstein, foi inicialmente
 * introduzido ao público através do newsgroup "comp.lang.c".
 * É uma função hash eficiente e simples que gera uma saída de hash com 32 bits de comprimento
 * através de uma sequência de operações bitwise e aritmética.
 * </p>
 *
 * @author Eduardo Correia, Guilherme França e João Vitor Café
 * @version 1.0
 * @since 2024-06-29
 */
public class DJB2Hash {
    /**
     * Método principal que lê a entrada do usuário e calcula o valor do hash.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do console
        final Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma entrada
        System.out.print("Digite uma entrada para a função hash: ");
        final String input = scanner.nextLine();

        // Calcula o valor do hash usando o método hash
        long hashValue = hash(input);
        // Exibe o valor do hash
        System.out.println("O resultado da função hash é: " + hashValue);

        // Fecha o Scanner
        scanner.close();
    }

    /**
     * Calcula o valor do hash para uma string de entrada usando o algoritmo DJB2.
     *
     * @param input A string de entrada.
     * @return O valor do hash calculado.
     */
    public static long hash(String input) {
        // Passo 1: Inicializa o valor do hash com um número primo grande.
        long hash = 5381;

        // Passo 2: Itera por cada caractere da string de entrada.
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Passo 3: Atualiza o valor do hash usando deslocamento à esquerda e adição.
            hash = ((hash << 5) + hash) + c; // hash * 33 + c
        }

        // Passo 4: Retorna o valor final do hash.
        return hash;
    }
}

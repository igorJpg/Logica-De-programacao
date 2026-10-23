package Ativ_ArraysVet;

import java.util.Scanner;
import java.util.Arrays;

public class anagramas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra = ler.next().toUpperCase();

        System.out.println("Digite a segunda palavra:");
        String palavra2 = ler.next().toUpperCase();

        char[] palavras = palavra.toCharArray();
        char[] palavras2 = palavra2.toCharArray();

        Arrays.sort(palavras);
        Arrays.sort(palavras2);

        if (Arrays.equals(palavras, palavras2)) {
            System.out.println("Palavra sao anagrama!");
        } else {
            System.out.println("Palavra nao sao anagrama!");
        }
    }
}

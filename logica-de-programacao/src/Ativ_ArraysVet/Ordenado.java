package Ativ_ArraysVet;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenado {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println("numeros ordenados com sucesso");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
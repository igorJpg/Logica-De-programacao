package Ativ_ArraysVet;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet1 = new int[8];
        int[] vet2 = new int[8];
        int[] vet3 = new int[8];

        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número do primeiro vetor:");
            vet1[i] = scanner.nextInt();
        }
        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número do segundo vetor:");
            vet2[i] = scanner.nextInt();
        }
        for (int i = 0; i < 8;i++) {
            vet3[i] = vet1[i] + vet2[i];
        }
        System.out.println("Vetores digitados:");
        for (int i = 0; i < vet3.length; i++) {
            System.out.println((i + 1) + ": " + vet3[i]);
        }
    }
}

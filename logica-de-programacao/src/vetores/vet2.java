package vetores;

import java.util.Scanner;

public class vet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n1 = new int[8];
        int[] n2 = new int[8];
        int[] n3 = new int[8];

        for (int i = 0; i < n1.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro para o primeiro vetor:");
            n1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro para o segundo vetor:");
            n2[i] = sc.nextInt();
        }

        for (int i = 0; i < n3.length; i++) {
            n3[i] = n1[i] + n2[i];
        }
        for (int i = 0; i < n3.length; i++) {
            System.out.println("Resultado da soma do " + (i + 1) + "º elemento dos vetores: " + n3[i]);
        }
    }
}
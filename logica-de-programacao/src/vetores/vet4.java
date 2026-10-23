package vetores;

import java.util.Scanner;

public class vet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[5];
        int vet2[] = new int[5];
        int vet3[] = new int[10];

        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro para o primeiro vetor:");
            int num = sc.nextInt();

            if (i > 0 && num <= vet1[i - 1]) {
                System.out.println("Digite um número menor ou igual ao anterior para manter a ordem crescente.");
                i--;
            } else {
                vet1[i] = num;
            }
        }
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro para o segundo vetor:");
            int num = sc.nextInt();

            if (i > 0 && num <= vet2[i - 1]) {
                System.out.println("Digite um número menor ou igual ao anterior para manter a ordem crescente.");
                i--;
            } else {
                vet2[i] = num;
            }
        }
        int k = 0, j = 0, i = 0;
        while (i < vet1.length && j < vet2.length) {
            if (vet1[i] < vet2[j]) {
                vet3[k++] = vet1[i++];
            } else {
                vet3[k++] = vet2[j++];
            }
        }
        for (i = 0; i < vet3.length; i++) {
            System.out.println("Resultado do vetor intercalado: " + vet3[i]);
        }
    }
}

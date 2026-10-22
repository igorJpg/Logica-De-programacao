package vetores;

import java.util.Scanner;

public class vet5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[5];
        int indiceMenor = 0;
        int indiceMaior = 0;

        System.out.println("Digite o 1º número inteiro para o vetor:");
        vet1[0] = sc.nextInt();

        int contTemMaior = vet1[0];
        int contTemMenor = vet1[0];

        for (int i = 1; i < vet1.length; i++) { // começa do 1!
            System.out.println("Digite o " + (i + 1) + "º número inteiro para o vetor:");
            vet1[i] = sc.nextInt();

            if (vet1[i] > contTemMaior) {
                contTemMaior = vet1[i];
                indiceMaior = i;
            }
            if (vet1[i] < contTemMenor) {
                contTemMenor = vet1[i];
                indiceMenor = i;
            }
        }
        System.out.println("Maior: " + contTemMaior + " na posicao " + indiceMaior);
        System.out.println("Menor: " + contTemMenor + " na posicao " + (indiceMenor + 1));
    }
}
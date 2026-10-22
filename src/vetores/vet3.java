package vetores;

import java.util.Scanner;

public class vet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] Imp = new int[10];
        int cont = 0;

        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número inteiro para o vetor:");
            vet1[i] = sc.nextInt();

            if (vet1[i] % 2 == 1){
                Imp[cont] = vet1[i];
                cont++;
            }
        }

        for (int j = 0; j < cont; j++) {
            System.out.println("Resultado do vetor de números ímpares: " + Imp[j]);
        }
    }
}
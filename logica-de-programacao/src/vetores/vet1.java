package vetores;

import java.util.Scanner;

public class vet1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n1 = new int[5];


        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < n1.length; i++) {
            n1[i] = sc.nextInt();
        }
        int resultado = 1;
        for (int i = 0; i < n1.length; i++) {
             resultado *= n1[i];
            System.out.println("Resultado: " + resultado);
        }



    }
}

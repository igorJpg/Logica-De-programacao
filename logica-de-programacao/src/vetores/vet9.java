package vetores;

import java.util.Scanner;

public class vet9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10];
        int tamA = 0;

        System.out.println("Digite os elementos do vetor A (999 para encerrar):");
        while (tamA < 10) {
            int numero = scanner.nextInt();
            if (numero == 999) break;

            boolean repetido = false;
            for (int i = 0; i < tamA; i++) {
                if (A[i] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                A[tamA] = numero;
                tamA++;
            } else {
                System.out.println("Elemento repetido, ignorado.");
            }
        }

        int[] B = new int[10];
        int tamB = 0;

        System.out.println("Digite os elementos do vetor B (999 para encerrar):");
        while (tamB < 10) {
            int numero = scanner.nextInt();
            if (numero == 999) break;

            boolean repetido = false;
            for (int i = 0; i < tamB; i++) {
                if (B[i] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                B[tamB] = numero;
                tamB++;
            } else {
                System.out.println("Elemento repetido, ignorado.");
            }
        }

        // Vetor C - uniao
        int[] C = new int[20];
        int tamC = 0;

        for (int i = 0; i < tamA; i++) {
            C[tamC] = A[i];
            tamC++;
        }

        for (int i = 0; i < tamB; i++) {
            boolean jaExiste = false;
            for (int j = 0; j < tamC; j++) {
                if (C[j] == B[i]) {
                    jaExiste = true;
                    break;
                }
            }
            if (!jaExiste) {
                C[tamC] = B[i];
                tamC++;
            }
        }
        

        // Vetor D - complementar (A - B)
        int[] D = new int[10];
        int tamD = 0;

        for (int i = 0; i < tamA; i++) {
            boolean estaEmB = false;
            for (int j = 0; j < tamB; j++) {
                if (A[i] == B[j]) {
                    estaEmB = true;
                    break;
                }
            }
            if (!estaEmB) {
                D[tamD] = A[i];
                tamD++;
            }
        }

        // Impressao
        System.out.print("Vetor A: ");
        for (int i = 0; i < tamA; i++) {
            if (i < tamA - 1) System.out.print(A[i] + ", ");
            else System.out.println(A[i]);
        }

        System.out.print("Vetor B: ");
        for (int i = 0; i < tamB; i++) {
            if (i < tamB - 1) System.out.print(B[i] + ", ");
            else System.out.println(B[i]);
        }

        System.out.print("Vetor C (uniao): ");
        for (int i = 0; i < tamC; i++) {
            if (i < tamC - 1) System.out.print(C[i] + ", ");
            else System.out.println(C[i]);
        }

        System.out.print("Vetor D (A complementar B): ");
        if (tamD == 0) {
            System.out.println("vazio");
        } else {
            for (int i = 0; i < tamD; i++) {
                if (i < tamD - 1) System.out.print(D[i] + ", ");
                else System.out.println(D[i]);
            }
        }

        scanner.close();
    }
}
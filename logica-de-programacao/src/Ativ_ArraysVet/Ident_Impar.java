package Ativ_ArraysVet;

public class Ident_Impar {
    public static void main(String[] args) {
        int[] num = new int[11];

        for (int i = 1; i < num.length; i++) {
            if  (i % 2 == 1) {
                System.out.println("Índice " + (i) + " é ímpar.");
            } else {
                System.out.println("Índice " + (i) + " é par.");
            }
        }
    }
}

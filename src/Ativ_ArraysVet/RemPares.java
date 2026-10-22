package Ativ_ArraysVet;

public class RemPares {
    public void main(String[] args) {
        int[] n1 = new int[5];
        int todo = 0;
        for (int i = 0; i < n1.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            n1[i] = new java.util.Scanner(System.in).nextInt();
        }

        System.out.println("numeros impares: " + todo);
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] % 2 != 0) {
                System.out.print(n1[i] + " ");
                todo += n1[i];
            }
        }
    }
}


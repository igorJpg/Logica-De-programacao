package vetores;
import java.util.Scanner;

public class matriz5 {

    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        leitura(a);
        leitura(b);
        calculo(a, b, c);
        resultado(c);

    }
    public static void leitura(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o " + (j + 1) + "º número inteiro para a " + (i + 1) + "ª linha da matriz:");
                matriz[i][j] = sc.nextInt();
            }
        }

    }
    public static void calculo(int a[][], int b[][], int c[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
    }
    public static void resultado(int c[][]) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.println("Resultado da multiplicação do " + (j + 1) + "º número da linha para a " + (i + 1) + "ª linha da coluna: " + c[i][j]);
            }
        }
    }
}

package vetores;
import java.util.Scanner;

public class matriz6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];


        System.out.println("Digite os 16 valores da matriz (linha por linha):");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                a[l][c] = sc.nextInt();
            }
        }

        soma(a);
    }

    public static void soma(int[][] matriz) {
        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            total += matriz[i][i];
        }

        System.out.println("Soma da diagonal principal: " + total);
    }
}
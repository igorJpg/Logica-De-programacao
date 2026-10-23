package vetores;

import java.util.Scanner;

public class matrizRelem {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }
    }

}

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();

        int resultado = 1;
        for (int i = n1;i >= 1;i--) {
            resultado *= i;
        }
        System.out.println(resultado);
    }
}
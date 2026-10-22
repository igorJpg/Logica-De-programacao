package vetores;

import java.util.Scanner;

public class soma {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
    int resultado = digito();
        System.out.println("Resultado: " + resultado);

    }
    public static int digito() {
        System.out.println("Informe o primeiro digito");
        int a = ler.nextInt();
        System.out.println("Informe o segundo digito");
        int b = ler.nextInt();
        return a+b;
    }
}

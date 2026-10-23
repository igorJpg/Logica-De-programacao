import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        double base = teclado.nextDouble();

        System.out.print("Digite o valor do expoente: ");
        double expoente = teclado.nextDouble();

        double resultado = Math.pow(base, expoente);

        System.out.println(base + " elevado a " + expoente + " é igual a: " + resultado);

        teclado.close();
    }
}
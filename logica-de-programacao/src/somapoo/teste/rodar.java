package somapoo.teste;

import somapoo.domain.conta;

import java.util.Scanner;

public class rodar {
    public static void main(String[] args) {
        conta conta = new conta();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();

        int resultado = conta.soma(a,b);
        System.out.println("O resultado da soma é: " + resultado);
    }
}

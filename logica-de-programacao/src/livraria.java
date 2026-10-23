import java.util.Scanner;

public class livraria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double contA = 0, contF = 0, contR = 0, contG = 0, contHR = 0, contH = 0, percentual;

        do {
            System.out.println("Informe o genero do livro que deseja comprar:");
            System.out.println("1 - Aventura\n2 - Ficção\n3 - Romance\n0 - Finalizar");
            opcao = sc.nextInt();
            if (opcao == 0) {
                break;
            }
            System.out.println("informe o seu genero");
            System.out.println("M- mulher\nH- homem");
            char genero = sc.next().charAt(0);
            genero = Character.toLowerCase(genero);

            switch (opcao) {
                case 1:
                    contA++;break;
                case 2:
                    contF++;break;
                case 3:
                    contG++;break;
            }
            if (genero == 'h') {
                contH++;
            }
            if (genero == 'h' && opcao == 3) {
                contHR++;
            }

        } while (opcao != 0);

        if (contA > contF || contA > contR) {
            System.out.println("Aventura");
        } else if (contF > contA || contF > contR) {
            System.out.println("Ficção");
        } else {
            System.out.println("Romance");
        }

        percentual = contHR / contH * 100;
        System.out.println("O percentual de homens que compraram romance é: " + percentual + "%");

    }
}

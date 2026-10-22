package vetores;
import java.util.Scanner;

public class livro {
    public static Scanner ler = new Scanner(System.in);
    public static int contR = 0;
    public static int contF = 0;
    public static int contA = 0;
    public static int contHR = 0;
    public static int contG = 0;

    static void main(String[] args) {

        int estilo;
        char sexo;

        do {

            estilo = TipoLivro();
            sexo = genero();
            contG++;

        } while (estilo != 0);

        MaisVendido(estilo, sexo);
        media();

    }

    public static int TipoLivro() {
        System.out.println("Digite o estilo do livro (1 - Romance, 2 - Ficção, 3 - Aventura):");
        int Estilo = ler.nextInt();
        if (Estilo == 1) {
            contR++;
        } else if (Estilo == 2) {
            contF++;
        } else if (Estilo == 3) {
            contA++;
        }
        return Estilo;
    }

    public static char genero() {
        System.out.println("Digite o seu gênero (M - Masculino, F - Feminino):");
        char sexo = Character.toUpperCase(ler.next().charAt(0));
        return sexo;
    }

    public static void MaisVendido(int e, char s) {
        if (contR > contF && contR > contA) {
            System.out.println("O estilo de livro mais escolhido foi Romance");
        } else if (contF > contR && contF > contA) {
            System.out.println("O estilo de livro mais escolhido foi Ficção");
        } else {
            System.out.println("O estilo de livro mais escolhido foi Aventura");
        }


        if (s == 'M' && e == 1) {
            contHR++;
        }
    }

    public static void media() {
        double mediaHR = ((double) contHR / contG) * 100;

        System.out.println("Media de livros de Romance escolhidos por homens: " + mediaHR + "%");
    }
}
import java.util.Scanner;

public class pesquisaEC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double contM = 0, contF = 0, contSolt = 0, contCasa = 0, contPes = 0, contIdaMul = 0, media = 0;
        while (true) {
            System.out.println("informe seu genero\n M-Masculino\n F-Feminino\n");
            char genero = ler.next().charAt(0);
            genero = Character.toUpperCase(genero);
            switch (genero) {
                case 'M':
                    contM++;
                    break;
                case 'F':
                    contF++;
                    break;
            }
            System.out.println("informe seu estado civil\n S-Solteiro\n C-Casado\n");
            char estadoCivil = ler.next().charAt(0);
            estadoCivil = Character.toUpperCase(estadoCivil);
            switch (estadoCivil) {
                case 'S':
                    contSolt++;
                    break;
                case 'C':
                    contCasa++;
                    break;
            }
            System.out.println("informe sua idade");
            int idade = ler.nextInt();
            if (genero == 'F') {
                contIdaMul += idade;
            }
            contPes++;
            if (contPes == 5) {
                break;
            }
        }
        if (contF > 0) {
            media = contIdaMul / contF;
            System.out.println("Media das idades das mulheres: " + media);
        } else {
            System.out.println("Nenhuma mulher entrevistada");
        }
        System.out.println("A media das idades das mulheres é: " + media + "%");
        if (contSolt > contCasa) {
            System.out.println("A maioria entrevistada era solteiro");
        } else {
            System.out.println("A maioria estrevistada era casado");
        }
    }
}

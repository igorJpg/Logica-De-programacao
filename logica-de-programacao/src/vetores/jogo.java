package vetores;
import java.util.Scanner;

public class jogo {

    static char[][] tabuleiro = new char[3][3];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarTabuleiro();
        int rodada = 1;
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            int jogador;
            char simbolo;

            if (rodada % 2 != 0) {
                jogador = 1;
                simbolo = 'X';
            } else {
                jogador = 2;
                simbolo = 'O';
            }

            System.out.println("Rodada " + rodada);
            System.out.println("É a vez do jogador " + jogador);

            int linha = lerPosicao("Linha: ");
            int coluna = lerPosicao("Coluna: ");

            if (posicaoValida(linha, coluna)) {
                tabuleiro[linha - 1][coluna - 1] = simbolo;
                imprimirTabuleiro();

                if (verificarVitoria(simbolo)) {
                    System.out.println("Jogador " + jogador + " ganhou!");
                    jogoAtivo = false;
                } else if (rodada == 9) {
                    System.out.println("Empate!");
                    jogoAtivo = false;
                } else {
                    rodada++;
                }
            } else {
                System.out.println("Posição inválida ou já ocupada. Tente novamente.");
            }
        }

        scanner.close();
    }

    static void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    static void imprimirTabuleiro() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
            System.out.println();
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
        System.out.println();
    }

    static int lerPosicao(String mensagem) {
        System.out.print(mensagem);
        int valor = scanner.nextInt();
        return valor;
    }

    static boolean posicaoValida(int linha, int coluna) {
        if (linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {
            return false;
        }
        if (tabuleiro[linha - 1][coluna - 1] != ' ') {
            return false;
        }
        return true;
    }

    static boolean verificarVitoria(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == simbolo && tabuleiro[i][1] == simbolo && tabuleiro[i][2] == simbolo) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == simbolo && tabuleiro[1][j] == simbolo && tabuleiro[2][j] == simbolo) {
                return true;
            }
        }

        if (tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) {
            return true;
        }

        if (tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) {
            return true;
        }

        return false;
    }
}
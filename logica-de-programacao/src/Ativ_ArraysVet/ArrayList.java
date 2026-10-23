package Ativ_ArraysVet;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        java.util.ArrayList<String> nomes = new java.util.ArrayList<>();
        String nome;

        do {
            System.out.println("Digite um nome (ou 'fim' para encerrar): ");
            nome = input.nextLine();

            if (!nome.equals("fim")) {
                nomes.add(nome);
            }

        } while (!nome.equals("fim"));

        System.out.println("Nomes digitados:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + ": " + nomes.get(i));
        }
    }
}
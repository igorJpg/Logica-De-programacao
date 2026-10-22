package treino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static treino.add_remov treino = new treino.add_remov("Meu Treino");

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar exercício");
            System.out.println("2 - Remover exercício");
            System.out.println("3 - Ver treino");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> adicionarExercicio();
                case 2 -> removerExercicio();
                case 3 -> treino.exibirTreino();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    static void adicionarExercicio() {
        System.out.print("Nome do exercício: ");
        String nome = sc.nextLine();

        System.out.print("Grupo muscular (ex: Peito, Costas, Pernas): ");
        String grupo = sc.nextLine();

        treino.Exercicio ex = new treino.Exercicio(nome, grupo);

        System.out.print("Quantas séries? ");
        int qtdSeries = sc.nextInt();

        for (int i = 1; i <= qtdSeries; i++) {
            System.out.print("  Série " + i + " - Repetições: ");
            int reps = sc.nextInt();
            System.out.print("  Série " + i + " - Peso (kg): ");
            double peso = sc.nextDouble();
            ex.adicionarSerie(reps, peso);
        }
        sc.nextLine();

        treino.add_exercicio(ex);
        System.out.println("Exercício '" + nome + "' adicionado!");
    }

    static void removerExercicio() {
        System.out.print("Nome do exercício para remover: ");
        String nome = sc.nextLine();

        boolean removeu = treino.removerExercicio(nome);
        if (removeu) {
            System.out.println("Exercício '" + nome + "' removido!");
        } else {
            System.out.println("Exercício não encontrado.");
        }
    }

    public static class Exercicio {
        private String nome;
        private String grupoMuscular;
        private List<series> series;

        public Exercicio(String nome, String grupoMuscular) {
            this.nome = nome;
            this.grupoMuscular = grupoMuscular;
            this.series = new ArrayList<>();
        }

        public void adicionarSerie(int repeticoes, double peso) {
            series.add(new series(repeticoes, peso));
        }

        public String getNome() { return nome; }
        public String getGrupoMuscular() { return grupoMuscular; }

        public void exibir() {
            System.out.println("  Exercício: " + nome);
            if (series.isEmpty()) {
                System.out.println("    (sem séries cadastradas)");
            } else {
                for (int i = 0; i < series.size(); i++) {
                    System.out.println("    Série " + (i + 1) + ": " + series.get(i));
                }
            }
        }
    }
}
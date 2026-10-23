package treino;

import java.lang.classfile.constantpool.FieldRefEntry;
import java.util.List;
import java.util.Map;

public class add_remov {
    private String nome;
    private Map<String, List<Exercicio>> exercicios;

    public add_remov(String nome) {
        this.nome = nome;
        this.exercicios = new java.util.HashMap<>();
    }

    public void add_exercicio(Exercicio exercicio) {
        String grupo = exercicio.getGrupoMuscular();
        exercicios.computeIfAbsent(grupo, k -> new java.util.ArrayList<>()).add(exercicio);
    }

    public boolean removerExercicio(String nomeExercicio) {
        for (List<Exercicio> lista : exercicios.values()) {
            boolean removeu = lista.removeIf(e -> e.getNome().equalsIgnoreCase(nomeExercicio));
            if (removeu) return true;
        }
        return false;
    }
    public void exibirTreino() {
        if (exercicios.isEmpty()) {
            System.out.println("Nenhum exercício cadastrado ainda.");
            return;
        }
        System.out.println("\n=== " + nome + " ===");
        for (Map.Entry<String, List<Exercicio>> entrada : exercicios.entrySet()) {
            if (!entrada.getValue().isEmpty()) {
                System.out.println("\n[" + entrada.getKey() + "]");
                for (Exercicio ex : entrada.getValue()) {
                    ex.exibir();
                }
            }
        }
    }
}
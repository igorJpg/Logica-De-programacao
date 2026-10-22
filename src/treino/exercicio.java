package treino;

import java.util.ArrayList;
import java.util.List;

class Exercicio {
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
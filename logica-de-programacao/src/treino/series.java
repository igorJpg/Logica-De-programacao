package treino;

public class series {
    private int repeticoes;
    private double peso;
    private boolean concluida;

    public series(int series, double peso) {
        this.repeticoes = series;
        this.peso = peso;
        this.concluida = false;
    }
    public String toString() {
        return repeticoes + "reps x" + peso + "kg" + (concluida ? " ✓" : " ");

    }
}
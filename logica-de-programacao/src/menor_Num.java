import java.util.ArrayList;

public class menor_Num {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(34);
        numeros.add(15);
        numeros.add(88);
        numeros.add(2);

        int menor = 0;
        for (Integer numero : numeros) {
            menor = numeros.get(0);
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O menor número é: " + menor);
    }
}

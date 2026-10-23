import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class for_each {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite " +  (1 + i) + " nomes:");
            String nomes = input.nextLine();
            list.add(nomes);
        }

        System.out.println("digite um numero que deseja remover");
        String remover = input.nextLine();

        list.removeIf(n -> n.equalsIgnoreCase(remover));

        System.out.println("-----------------------------");
        for (int i = 0; i < list.size(); i++) {
            list.removeIf(n -> n.length() > 5);
            System.out.println(list.get(i));
        }
    }
}



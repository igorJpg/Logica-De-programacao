package Ativ_ArraysVet;

class SemRepeticao {
    public static void main(String[] args) {
        int[] original = new int[20];
        int[] semRep = new int[20];
        int contOriginal = 0;
        int contSemRep = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Digite números positivos (0 para parar):");

        while (contOriginal < 20) {
            System.out.println("Digite o " + (contOriginal + 1) + "º número:");
            int num = sc.nextInt();

            if (num == 0) break;

            original[contOriginal] = num;
            contOriginal++;

            // verifica se já existe no vetor semRep
            boolean jaExiste = false;
            for (int i = 0; i < contSemRep; i++) {
                if (semRep[i] == num) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                semRep[contSemRep] = num;
                contSemRep++;
            }
        }

        System.out.println("\nSequência original:");
        for (int i = 0; i < contOriginal; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.println("\nSequência sem repetições:");
        for (int i = 0; i < contSemRep; i++) {
            System.out.print(semRep[i] + " ");
        }

        sc.close();
    }
}
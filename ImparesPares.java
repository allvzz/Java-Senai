public class ImparesPares {
    public static void main(String[] args) {
        // Exibir números ímpares de 1 a 51
        System.out.println("Números ímpares de 1 a 51:");
        for (int i = 1; i <= 51; i++) {
            if (i % 2 != 0) {  // Verifica se o número é ímpar
                System.out.println(i);
            }
        }

        // Exibir números pares de 52 a 100
        System.out.println("\nNúmeros pares de 52 a 100:");
        for (int i = 52; i <= 100; i++) {
            if (i % 2 == 0) {  // Verifica se o número é par
                System.out.println(i);
            }
        }
    }
}

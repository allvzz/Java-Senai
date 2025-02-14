public class MultiplosDe3 {
    public static void main(String[] args) {
        int contador = 0;

        // verificar múltiplos de 3 entre 1 e 100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) { // Verifica se o número é múltiplo de 3
                contador++;
            }
        }

        // Exibir a quantidade de múltiplos de 3
        System.out.println("A quantidade de números múltiplos de 3 entre 1 e 100 é: " + contador);
    }
}

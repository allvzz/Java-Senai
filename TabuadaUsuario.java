import java.util.Scanner;

public class TabuadaUsuario {
    public static void main(String[] args) {
        // Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário um número
        System.out.print("Digite um número para exibir sua tabuada: ");
        int numero = scanner.nextInt();

        // Exibir a tabuada do número
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fechar o scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        
        if (num == 0) {
            System.out.println("O número é nulo.");
        } else if (num > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
        
        
        scanner.close();
    }
}

import java.util.Scanner;

public class MenuCanetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner
        int op = 0; // Inicializando variavel opções

        while (op !=4) { // Menu
            System.out.println("\n=== Menu de Canetas ===");
            System.out.println("1 - Caneta Esferografica");
            System.out.println("2 - Caneta Gel");
            System.out.println("3 - Caneta Tinteiro");
            System.out.println("4 - Sair");
            System.out.print("Escolha a opção: ");
            op = sc.nextInt(); // Ler a opção

        switch (op) {
            case 1:
                System.out.println("\nCaneta Esferografica: Economica e de longa duraçao");
                break;
            case 2:
                System.out.println("\nCaneta Gel: Tinta mais pigmentada e escrita suave");
                break;
            case 3:
                System.out.println("\nCaneta Tinteiro: Classica e elegante, usada para caligrafia");
                break;
            case 4:
                System.out.println("\nSaindo...");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
            }
        }

        sc.close();

    }
    
}

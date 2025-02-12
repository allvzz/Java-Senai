import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int op = 0;  

        while (op != 5) { 
            System.out.println("\n=== Menu ===");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - ALTERAR");
            System.out.println("3 - LISTAR");
            System.out.println("4 - REMOVER");
            System.out.println("5 - SAIR");
            System.out.print("ESCOLHA A OPÇÃO: ");
            op = sc.nextInt();  

            switch (op) {
                case 1:
                    System.out.println("Você escolheu CADASTRAR.");
                    break;
                case 2:
                    System.out.println("Você escolheu ALTERAR.");
                    break;
                case 3:
                    System.out.println("Você escolheu LISTAR.");
                    break;
                case 4:
                    System.out.println("Você escolheu REMOVER.");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        }

        sc.close();
    }
}

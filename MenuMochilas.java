import java.util.Scanner;

public class MenuMochilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner
        int op = 0; // Opçao/Variavel

        while (op !=4) { //Menu
            System.out.println("\n===Menu de Mochilas===");
            System.out.println("1 - Mochila Escolar");
            System.out.println("2 - Mochila de Viagem");
            System.out.println("3 - Mochila Esportiva");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt(); //Ler opção

        switch (op) {
            case 1:
                System.out.println("\nMochila Escolar: Compacta e ideal para estudantes");
                break;
            case 2:
                System.out.println("\nMochila de Viagem: Espaçosa, ideal para longas jornadas");
                break;
            case 3:
                System.out.println("\nMochila Esportiva: Leve, resistente e ergonomica");
                break;
            case 4:
                System.out.println("\nSaindo...");
                break;
            default:
                System.out.println("Tente novamente!");
                break;
        }
    }
    
    sc.close();
    }
}
    

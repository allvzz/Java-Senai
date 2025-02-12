import java.util.Scanner;

public class MenuEmbalagem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner pra ler as entradas
        int op = 0; //Iniciando a variavel op

        while (op != 4) { // Menu até a escolha
            System.out.println("\n===Menu de embalagens===");
            System.out.println("1 - CAIXA DE PAPELÃO");
            System.out.println("2 - SACOLA PLASTICA");
            System.out.println("3 - EMBALAGEM DE VIDRO");
            System.out.println("4 - SAIR");
            System.out.println("Escolha a opção");
            op = sc.nextInt(); //Ler a opção escolhida

            switch (op) {
                case 1: 
                    System.out.println("\nCaixa de papelão: Ideal para transporte e armazenamento");
                    break;
                case 2: 
                    System.out.println("\nSacola Plastica: Leve e pratica, mas pouco sustentavel");
                    break;
                case 3:
                    System.out.println("\nEmbalagem de Vidro: Resistente e reutilizavel");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente");
                    break;

            
        }
    }

    sc.close(); // Fechar o scanner
    
    }
}
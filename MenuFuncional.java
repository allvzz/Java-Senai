import java.util.Scanner; // importaçao do scanner

public class MenuFuncional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para leitura
        double total = 0;
        int opcao;
        
        do { // loop de menu
            System.out.println("\n=== Menu do Restaurante ===");
            System.out.println("1. Feijoada Completa - R$ 45,90");
            System.out.println("   Feijoada tradicional com arroz, couve e farofa");
            System.out.println("2. Picanha na Brasa - R$ 89,90"); 
            System.out.println("   Picanha grelhada com arroz, feijão e vinagrete");
            System.out.println("3. Salmão Grelhado - R$ 69,90");
            System.out.println("   Filé de salmão com legumes e purê de batatas");
            System.out.println("4. Massa ao Molho Pesto - R$ 49,90");
            System.out.println("   Espaguete com molho pesto, tomates e parmesão");
            System.out.println("5. Moqueca de Peixe - R$ 65,90");
            System.out.println("   Moqueca baiana com arroz e pirão");
            System.out.println("6. Frango à Parmegiana - R$ 45,90");
            System.out.println("   Filé de frango empanado com arroz e batatas");
            System.out.println("7. Risoto de Camarão - R$ 72,90");
            System.out.println("   Risoto cremoso com camarões frescos");
            System.out.println("8. Bife à Milanesa - R$ 42,90");
            System.out.println("   Bife empanado com arroz, feijão e batatas fritas");
            System.out.println("9. Strogonoff de Carne - R$ 47,90");
            System.out.println("   Strogonoff com arroz e batata palha");
            System.out.println("10. Lasanha à Bolonhesa - R$ 39,90");
            System.out.println("    Lasanha tradicional com molho bolonhesa");
            System.out.println("0. Finalizar pedido");
            
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt(); //leitura da escolha
            
            switch(opcao) { // switch pra escolha
                case 1:
                    total += 45.90;
                    System.out.println("Feijoada Completa adicionada ao pedido!");
                    break;
                case 2:
                    total += 89.90;
                    System.out.println("Picanha na Brasa adicionada ao pedido!");
                    break;
                case 3:
                    total += 69.90;
                    System.out.println("Salmão Grelhado adicionado ao pedido!");
                    break;
                case 4:
                    total += 49.90;
                    System.out.println("Massa ao Molho Pesto adicionada ao pedido!");
                    break;
                case 5:
                    total += 65.90;
                    System.out.println("Moqueca de Peixe adicionada ao pedido!");
                    break;
                case 6:
                    total += 45.90;
                    System.out.println("Frango à Parmegiana adicionado ao pedido!");
                    break;
                case 7:
                    total += 72.90;
                    System.out.println("Risoto de Camarão adicionado ao pedido!");
                    break;
                case 8:
                    total += 42.90;
                    System.out.println("Bife à Milanesa adicionado ao pedido!");
                    break;
                case 9:
                    total += 47.90;
                    System.out.println("Strogonoff de Carne adicionado ao pedido!");
                    break;
                case 10:
                    total += 39.90;
                    System.out.println("Lasanha à Bolonhesa adicionada ao pedido!");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0); // loop de pedido
        
        if (total > 0) { // se o total for maior que 0
            System.out.println("\nTotal do pedido: R$ " + String.format("%.2f", total));
            System.out.println("\nFormas de Pagamento:");
            System.out.println("1. Dinheiro");
            System.out.println("2. Cartão de Débito");
            System.out.println("3. Cartão de Crédito");
            System.out.println("4. PIX");
            
            System.out.print("\nEscolha a forma de pagamento: ");
            int formaPagamento = scanner.nextInt(); // leitura da forma de pagamento

            switch(formaPagamento) {
                case 1:
                    System.out.println("Pagamento em Dinheiro selecionado!");
                    break;
                case 2:
                    System.out.println("Pagamento em Cartão de Débito selecionado!");
                    break;
                case 3:
                    System.out.println("Pagamento em Cartão de Crédito selecionado!");
                    break;
                case 4:
                    System.out.println("Pagamento via PIX selecionado!");
                    break;
                default:
                    System.out.println("Forma de pagamento inválida!");
                    return;
            }
            
            System.out.println("\nCompra finalizada com sucesso!");
            System.out.println("Agradecemos a preferência!");
        }
        
        scanner.close(); // fechamento do scanner
    }
}

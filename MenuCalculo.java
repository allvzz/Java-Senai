import java.util.Scanner;

public class MenuCalculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("\n---- Calculadora ----");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("5 - SAIR");
            System.out.print("\nEscolha uma opção: ");
            op = sc.nextInt();

            if (op >= 1 && op <= 4) {
                System.out.println("Digite o primeiro numero: ");
                double num1 = sc.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double num2 = sc.nextDouble();

                switch (op) {
                    case 1:
                        System.out.println("Resultado: " +(num1 + num2));
                        break;
                    case 2: 
                        System.out.println("Resultado: " +(num1 - num2));
                        break;
                    case 3: 
                        System.out.println("Resultado: " +(num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " +(num1 / num2));                           
                        } else {
                            System.out.println("Erro, divisao por zero!");
                        }
                        break;
                }
                                
            }else if (op == 5){
                System.out.println("Saindo...");
            }else {
                System.out.println("Opçao invalida! Tente novamente");
            }

        } while (op != 5);
        sc.close();
    }
}
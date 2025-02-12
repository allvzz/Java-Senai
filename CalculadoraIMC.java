import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso.");
        } else if (imc >= 30) {
            System.out.println("Classificação: Obesidade.");
        }

        scanner.close();
    }
}
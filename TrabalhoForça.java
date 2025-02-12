import java.util.Scanner;

public class TrabalhoForça {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a força aplicada (em newtons): ");
        double forca = scanner.nextDouble();

        System.out.print("Digite a distância percorrida (em metros): ");
        double distancia = scanner.nextDouble();

        double trabalho = forca * distancia;

        System.out.println("O trabalho realizado é: " + trabalho + " joules.");

        scanner.close();
    }
}

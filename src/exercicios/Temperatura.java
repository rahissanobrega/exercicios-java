package exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5*(fahrenheit -32)/9);

        System.out.printf("%.1f° fahrenheit em celsius é %.1f° graus", fahrenheit , celsius);

        scanner.close();

    }
}

package exercicios;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salarioUsuario = scanner.nextDouble();
        scanner.close();

        double salarioMinimo = 1525;
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("Você recebe: " + quantidadeSalariosMinimos + " salários minimos." );

    }
}

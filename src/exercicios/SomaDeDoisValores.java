package exercicios;

import java.util.Scanner;

public class SomaDeDoisValores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        scanner.close();
        int resultado;

        if (numero1 == numero2) {
            resultado = numero1 + numero2;
            System.out.println("A soma dos números é: " + resultado);
        } else {
            resultado = numero1 * numero2;
            System.out.println("A múltiplicação dos números é: " + resultado);
        }
    }
}

package exercicios;

import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cálculo de IMC");
        System.out.println("---------------------------------");

        System.out.println("Digite seu peso formato 00,00: ");
        double pesoPessoa = scanner.nextDouble();
        System.out.println("Digite sua altura no formato 0,00: ");
        double alturaPessoa = scanner.nextDouble();

        double imc = pesoPessoa / (alturaPessoa * alturaPessoa);

        if (imc <= 18.50) {
            System.out.println("Abaixo do peso!");
        } else if (imc >= 18.60 && imc <= 24.90) {
            System.out.println("Peso ideal (parabéns!)");
        } else if (imc >= 25.00 && imc <= 29.90) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.00 && imc <= 34.90) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35.00 && imc <= 39.90) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
        scanner.close();
    }
}

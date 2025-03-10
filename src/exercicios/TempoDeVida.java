package exercicios;

import java.util.Scanner;

public class TempoDeVida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano do seu nascimento ex: 2003 ");
        int anoDoNascimento = scanner.nextInt();
        System.out.println("\nDigite o mês do seu nascimento ex: 11");
        int mesDoNascimento = scanner.nextInt();
        System.out.println("\nDigite o dia do seu nascimento ex: 10");
        int diaDoNascimento = scanner.nextInt();

        scanner.close();
    }
}

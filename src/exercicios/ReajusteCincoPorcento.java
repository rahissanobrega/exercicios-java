package exercicios;

import java.util.Scanner;

public class ReajusteCincoPorcento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salário atual: ");
        double salarioAtual = scanner.nextDouble();
        double salarioComReajuste = salarioAtual * 1.05;

        System.out.println("Seu salário com o reajuste de 5% ficará: R$"+ salarioComReajuste);

        scanner.close();
    }
}

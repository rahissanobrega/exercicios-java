package exercicios;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de cálculo de médio final do aluno");
        System.out.println("\nUse o formato 00,00 para inserir a nota");
        System.out.println("--------------------------------------------");

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota do aluno: ");
        double nota4 = scanner.nextDouble();

        double calculoMedia = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("\nA media do aluno é de " + calculoMedia);


        scanner.close();
    }
}

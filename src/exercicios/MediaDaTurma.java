package exercicios;

import java.util.Scanner;

public class MediaDaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n       Cálculo de média de notas na turma");
        System.out.println("------------------------------------------------------");

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Informe a nota (ou digite -1 para obter o resultado) ");
            nota = scanner.nextDouble();
            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            }
            else if (nota != -1) {
                System.out.println("informe uma nota válida!!!!");
            }
        }
        double media = total / quantidadeDeNotas;
        System.out.printf("A média da turma ficou de %.2f", media);
        System.out.println();
        scanner.close();
    }
}

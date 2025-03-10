package exercicios;

import java.util.Scanner;

public class VerdadeiroOuFalso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você tem precisa de roupas novas? ");
        boolean precisaDeRoupas = scanner.nextBoolean();
        System.out.println("Você tem dinheiro para comprar roupas novas? ");
        boolean temDinheiro = scanner.nextBoolean();

        if (precisaDeRoupas && temDinheiro){
            System.out.println("Ambos são verdadeiro, e você pode comprar roupas novas!");
        } else if (!precisaDeRoupas && !temDinheiro) {
            System.out.println("Ambos são falsos, e você não pode comprar roupas novas!");
        }else if (precisaDeRoupas && !temDinheiro){
            System.out.println("Ambos valores são diferentes, e você não tem dinheiro para comprar roupas novas!");
        }else {
            System.out.println("Ambos valores são diferentes, e você pode escolher se quer comprar roupas novas!");
        }

        scanner.close();
    }
}

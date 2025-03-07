package exercicios;

import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Seu sucessor é: " + sucessor);
        System.out.println("Seu antecessor é: "+ antecessor);

    }
}

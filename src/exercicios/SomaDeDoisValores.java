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

        if (numero1 == numero2){
            System.out.println("A soma dos numero é: " + (numero1 + numero2));
        }else {
            System.out.println("A subtração dos numero é: " + (numero1 - numero2));
        }
    }
}

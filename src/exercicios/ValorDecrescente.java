package exercicios;

import java.util.Scanner;

public class ValorDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero2 > numero3) {
            System.out.println(numero1 + " " + numero2 + " " + numero3);
        } else if (numero1 > numero3 && numero3 > numero2) {
            System.out.println(numero1 + " " + numero3 + " " + numero2);
        } else if (numero2 > numero1 && numero1 > numero3) {
            System.out.println(numero2 + " " + numero1 + " " + numero3);
        } else if (numero2 > numero3 && numero3 > numero1) {
            System.out.println(numero2 + " " + numero3 + " " + numero1);
        }else if (numero3 > numero2 && numero2 > numero1) {
            System.out.println(numero3 + " " + numero2 + " " + numero1);
        }else {
            System.out.println(numero3 + " " + numero1 + " " + numero2);
        }

        scanner.close();
    }
}

package parOuImpar;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 2 == 0 && numero >= 0) {
            System.out.println("O numero " + numero + " é par e positivo");
        } else if (numero % 2 != 0 && numero > 0) {
            System.out.println("O numero " + numero + " é impar e positivo");
        }else if (numero % 2 == 0 && numero <= 0) {
            System.out.println("O numero " + numero + " é par e negativo");
        }else {
            System.out.println("O numero " + numero + " é impar e negativo");
        }


    }
}

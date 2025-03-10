package exercicios;

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEscreva seu nome: ");
        String nomePessoa = scanner.next();
        System.out.println("\nInforme sua idade: ");
        int idadePessoa = scanner.nextInt();

        if (idadePessoa >= 18){
            System.out.printf("%s, você é maior de idade, portanto pode comprar bebidas alcoólicas", nomePessoa);
        }else {
            System.out.printf("%s, você é menor de idade, portanto não pode comprar bebidas alcoólicas", nomePessoa);
        }
        scanner.close();

    }
}

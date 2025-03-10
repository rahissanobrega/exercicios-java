package exercicios;

import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;

        System.out.println("Digite o valor do produto: ");
        double valorDoProduto = scanner.nextDouble();

        System.out.println("\nEscolha a forma de pagamento do seu Playstation 5: ");
        System.out.println(" 1- À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println(" 2- À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println(" 3- Parcelado no cartão em duas vezes, sem juros");
        System.out.println(" 4- Parcelado no cartão em três vezes ou mais, juros de 10%");

        byte formaDePagamento = scanner.nextByte();

        switch (formaDePagamento) {
            case 1:
                double valorDinheiro = valorDoProduto - (valorDoProduto * 0.15);
                System.out.printf("O valor do produto será de: R$ %.2f", valorDinheiro);
                break;
            case 2:
                double valorCartao = valorDoProduto - (valorDoProduto * 0.10);
                System.out.printf("O valor do produto será de: R$ %.2f", valorCartao);
                break;
            case 3:
                double valorNormal = valorDoProduto;
                System.out.printf("O valor do produto será de: R$ %.2f", valorNormal);
                break;
            case 4:
                double valorParcelado = valorDoProduto + (valorDoProduto * 0.10);
                System.out.printf("O valor do produto será de: R$ %.2f", valorParcelado);
                break;
            case 5:
                System.out.println("Opção Inválida");
                break;
        }


        scanner.close();
    }
}

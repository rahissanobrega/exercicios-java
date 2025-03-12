package exercicios;

import java.util.Scanner;

public class CalculoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Quanto tempo você demorou para chegar no seu destino? (ex: 0,30)");
        double tempo = scanner.nextDouble();
        System.out.println("A quantos KM/h você dirigiu ao seu destino?");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 35;
        double valorGasto = litrosUsados * 7.29;

        System.out.printf("Você usou %.2fL de gasolina, e gastou R$%.2f até o seu chegar ao seu destino ", litrosUsados, valorGasto);
    }

}

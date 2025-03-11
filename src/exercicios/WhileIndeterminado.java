package exercicios;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valor = "";
        while (!valor.equalsIgnoreCase("Sair")){
            System.out.println("Você diz: ");
            valor = scanner.nextLine();
        }

        scanner.close();
    }
}

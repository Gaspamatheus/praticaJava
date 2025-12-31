package com.pratica.WhileDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class somaIndeterminada {
    public static void main(String[] args) {
        //faça uma estrutura while q so será realizada a soma qunado foradicionado 0
        //Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.print("Escreva o valor para adicionar na soma: ");
        double i = scanner.nextDouble();
        double total = 0;

        while (i != 0) {
            total = total + i;

            System.out.print("Escreva outro numero para domar, para sair adicione 0: ");
            i = scanner.nextDouble();
        }

        System.out.println("A soma total foi: " + total);

        scanner.close();
    }
}

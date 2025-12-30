package com.pratica.estruturaMaisFacil;

import java.util.*;

public class mediaEscolarIfElse {
    public static void main(String[] args) {
        // faça primeiro a média
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = ((nota1 + nota2 + nota3) / 3) ;

        System.out.println("A média é: " + media);

        if (media >= 7){
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}
// presta atenção no idioma do teclado
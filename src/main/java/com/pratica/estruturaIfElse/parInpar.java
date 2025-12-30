package com.pratica.estruturaIfElse;

import java.util.Scanner;

public class parInpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é par ou impar");
        int numero = scanner.nextInt();
        System.out.println("O número digitado foi: " + numero);

        int parImpar = numero % 2;

        if(parImpar == 0){
            System.out.println("Este número é par");
        } else {
            System.out.println("esse numero é impar");
        }

    }
}

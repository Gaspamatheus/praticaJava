package com.pratica.metodos;

import java.util.Random;

public class metodoRomdom {
    public static void main(String[] args) {

        Random random = new Random();

        // Número aleatório entre 0 e 99
        int numero = random.nextInt(100);

        // Número aleatório entre 1 e 100
        int numero2 = random.nextInt(100) + 1;

        // Número aleatório entre 10 e 50
        int numero3 = random.nextInt(41) + 10;

        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(numero3);
    }
}


package com.pratica;

import java.util.Scanner;

/*
    estrutura switch
        switch(valor a testar){
            case valor:
                codigo a ser executado;
                break;
        }
 */
public class estruturaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1 :
                System.out.println("ver extrato");
                break;

            case 2 :
                System.out.println("Fazer deposito");
                break;

            case 3 :
                System.out.println("fazer pix");
                break;

            default :
                System.out.println("selecione uma das opções de 1 a 3");
        }
    }
}

package com.pratica.WhileDoWhile;

import javax.swing.*;
import java.util.Random;

public class praticaWhile {
    public static void main(String[] args) {
        Random random = new Random();
        int sorteado = random.nextInt(2);

        String x = JOptionPane.showInputDialog("Digite um número: ");
        int numero = Integer.parseInt(x);

        while (numero != sorteado) {
            JOptionPane.showMessageDialog(null, "número errado, digite novamente");

            //solicitar um novo numero dentro do loop
            x = JOptionPane.showInputDialog("Digite outro numero: ");
            numero = Integer.parseInt(x);
        }
        JOptionPane.showMessageDialog(null, "número certo");
    }
}

package com.pratica.metodos;
import javax.swing.JOptionPane;
import java.lang.String;

public class JOptionpane {
    public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog("Digite a sua idade: ");
        int idadeInt = Integer.parseInt(idade);
        JOptionPane.showMessageDialog(null,
                "A idade digitada foi: " + idadeInt,
                "idade informada",
                JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showMessageDialog(
                null,
                "Olá mundo",
                "saudação",
                JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showMessageDialog(
                null,
                "Deu tudo certo!",
                "Status",
                JOptionPane.INFORMATION_MESSAGE
        );

    }
}
/*
O JOptionPane tem a opção de mostrar mensagens, pedir textos, pedir confirmaçoes em pop-up

para usar se importa o "javax.swing.JOptopnPane

metodo para oedir um texto: "showInputDialog" -> como vai receber dados tem que declarar a
variavel, usar o metodo "parse" para transforma de String para o tipo de dado
 */
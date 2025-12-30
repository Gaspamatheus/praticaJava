package com.pratica.estruturaMaisFacil;
/* estrutura
    (condição) ? verdaira : falsa

    declara variavel como string e faz acondicional
 */
import java.util.Scanner;

public class operadoresTernarios {
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

        String resultadoAluno = (media >= 7) ? "aprovado" : "reprovado";
        System.out.println(resultadoAluno);
    }
}

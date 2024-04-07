/*Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. 
Finalize digitando idade igual a zero. */

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner dadosScanner = new Scanner(System.in);
        
        int idade,quantidade = 0,somaIdades = 0;

        System.out.println("Digite as idades (digite 0 para encerrar): ");

        for (;;) {
            System.out.println("Digite sua idade: ");
            idade = dadosScanner.nextInt();
            
            if (idade == 0) {
                break;
            }

            quantidade++;
            somaIdades += idade;
        }

        if (quantidade > 0) {
            double media = somaIdades / quantidade;
            System.out.println("A quantidade das idades digitadas é: " + quantidade);
            System.out.println("A média das idades digitadas é: " + media);

        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }
        dadosScanner.close();
    }
}

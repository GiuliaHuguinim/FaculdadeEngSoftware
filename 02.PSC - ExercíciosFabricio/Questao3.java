/*Escreva um programa que calcule o teorema de Pitágoras, representado pela expressão: c =a2+b2  */

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);
        double catetoA, catetoB, soma, raiz;
        
        System.out.println("Vamos calcular o valor da hipotenusa!");

        System.out.println("Digite o valor do cateto A: ");
        catetoA= dadosScanner.nextDouble();
        
        System.out.println("Digite o valor do cateto B: ");
        catetoB=dadosScanner.nextDouble();

        soma= ((catetoA*catetoA) + (catetoB*catetoB));
        raiz=Math.sqrt(soma);
        
        System.out.println("O valor da soma dos catetos é "+soma+ ", e valor da hipotenusa é igual: " + raiz);

        dadosScanner.close();
        }
        
}

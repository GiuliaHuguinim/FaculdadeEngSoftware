/*Crie um programa para calcular a regra de três. */

import java.util.Scanner;
public class Questao4 {

    public static void main(String[] args) {
        double valor1,valor2, valor3, resultado1;

        Scanner dadosScanner=new Scanner(System.in);
        System.out.println("Vamos calcular a regra de três!");

        System.out.println("Digite o primeiro valor: ");
        valor1=dadosScanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        valor2=dadosScanner.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        valor3=dadosScanner.nextDouble();

        System.out.println("Eu fiz "+valor1+ " tortas para "+valor2+" pessoas,se eu fizer "+ valor3+" tortas será para quantas pessoas?");

        resultado1 = (valor1 * valor3) / valor2;

        System.out.println("Será "+resultado1+" pessoas"); 
        
        
        dadosScanner.close();
        }
}


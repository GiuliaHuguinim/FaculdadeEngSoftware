/*Faça um Programa que leia 4 notas, mostre as notas e a média na tela */
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        System.out.println("Digite as 4 notas:");

        for (int i = 0; i < 4; i++) {
            notas[i] = input.nextDouble();
            soma += notas[i];
        }

        double media = soma / 4;
        
        System.out.println("Notas inseridas:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }
        System.out.println("Média: " + media);

        input.close();
    }
}
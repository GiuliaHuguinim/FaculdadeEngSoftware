/*Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números. */
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = input.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("\nNúmeros:");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        input.close();
    }
}
 /*Faça um programa que preencha um vetor com nove números inteiros,
calcule e mostre os números primos e suas respectivas posições.*/
 
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner dadosScanner = new Scanner(System.in);
        
        int[] vetor = new int[9];

        for(int i = 0; i < vetor; i++){
            System.out.println("Digite 9 números inteiros: ");
            int numero=dadosScanner.nextInt();

            vetor[i] = numero;
        }

        for(int i = 0; i < vetor; i++){
            System.out.println(vetor[i]);
        }

        dadosScanner.close();
    }
}

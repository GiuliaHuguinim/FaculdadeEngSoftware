// Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor.
import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
    Scanner dadosScanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int numero=Integer.parseInt(dadosScanner.nextLine());

    int sucessor= numero+1;
    int antecessor= numero-1;

    System.out.println("O número digitado foi " + numero + ", o seu sucessor é " + sucessor+ " e o antecessor é " + antecessor);

    

    dadosScanner.close();
    }
    
}
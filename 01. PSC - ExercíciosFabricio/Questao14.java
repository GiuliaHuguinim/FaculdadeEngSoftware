import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);
        String nome, pais;
        String[] troca;

        System.out.print("Escreva seu nome: ");
        nome = dadosScanner.nextLine();

        System.out.print("Qual país você nasceu? ");
        pais = dadosScanner.nextLine();

        troca = new String[2];
        troca[0] = pais;
        troca[1] = nome;

        System.out.print(String.format("Seu nome é: %s\nVocê nasceu em: %s",
        troca[0], troca[1]));

        dadosScanner.close();
    }
}
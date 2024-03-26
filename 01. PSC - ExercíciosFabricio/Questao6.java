import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        int ano=  365;
        Scanner dadoScanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao programa de quantos dias você está no planeta terra");
        System.out.println("Digite sua idade:");
        int idade = Integer.parseInt(dadoScanner.nextLine());
        int resultado = ano * idade;

        System.out.println("O Total de dias foram:  " + resultado);
        dadoScanner.close();
    }

}
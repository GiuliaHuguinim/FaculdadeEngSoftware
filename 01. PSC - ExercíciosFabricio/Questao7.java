import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner dadoScanner = new Scanner(System.in);
        double salarioPorcentagem= 7.0;
        System.out.println("Olá você está entrando no reajuste da empresa Gi");
        System.out.println("Hoje a taxa está 7% em relação ao seu salário, por favor digite seu salário:");
        double salarioDouble=Double.parseDouble(dadoScanner.nextLine());

        double resultado= salarioDouble + (salarioDouble*(salarioPorcentagem/100));

        System.out.println("Com o reajuste seu salário atual:  " + resultado);
        
    dadoScanner.close();
    }
}
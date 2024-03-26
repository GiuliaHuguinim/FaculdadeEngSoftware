import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
    Scanner dadosScanner = new Scanner(System.in);
    System.out.println("Vamos calcular a média simples!");
    System.out.println("Digite a primeira nota: ");
    double notaUm = Double.parseDouble(dadosScanner.nextLine());
    System.out.println("Digite a segunda nota: ");
    double notaDois = Double.parseDouble(dadosScanner.nextLine());
    System.out.println("Digite a terceira nota: ");
    double notaTres = Double.parseDouble(dadosScanner.nextLine());

    double resultado = (notaUm + notaDois + notaTres)/ 3;

    System.out.println("A sua média foi: " + resultado);

    dadosScanner.close();
    }
    
}

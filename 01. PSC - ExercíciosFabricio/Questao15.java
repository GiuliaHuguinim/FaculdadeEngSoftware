import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner dadoScanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double valorA = Double.parseDouble(dadoScanner.nextLine());

        System.out.print("Digite o valor de B: ");
        double valorB = Double.parseDouble(dadoScanner.nextLine());

        System.out.print("Digite o valor de C: ");
        double valorC = Double.parseDouble(dadoScanner.nextLine());
        
        double delta = valorB * valorB - 4 * valorA * valorC;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
            dadoScanner.close();
            return;
        }

       double  raizUm = (-valorB + Math.sqrt(delta)) / (2 * valorA);
       double raizDois = (-valorB - Math.sqrt(delta)) / (2 * valorA);

        System.out.print(String.format("Raiz 1: %s\nRaiz 2: %s", arredondar(raizUm), arredondar(raizDois)));

        dadoScanner.close();
    }

    private static double arredondar(double valor) {
        DecimalFormat formato = new DecimalFormat("0.000");
        double numeroArredondado = Double.parseDouble(formato.format(valor));

        return numeroArredondado;
    }
}
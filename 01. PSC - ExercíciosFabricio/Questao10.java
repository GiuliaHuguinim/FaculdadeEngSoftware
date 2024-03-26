import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao10 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);
        double grauF, grauC;

        System.out.print("Escreva a temperatura em Fahrenheit: ");
        grauF = dadosScanner.nextDouble();

        grauC = (grauF - 32) / 9 * 5;

        System.out.print(String.format("A conversão de %s graus Fahrenheit em graus Celsius é %s", grauF, arredondar(grauC)));
        dadosScanner.close();
    }

    private static double arredondar(double valor) {
        DecimalFormat formato = new DecimalFormat("0.0");
        double numeroArredondado = Double.parseDouble(formato.format(valor));

        return numeroArredondado;
    }
}
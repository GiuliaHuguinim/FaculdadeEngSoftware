import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);
        int qtdCanetas, valorNota;
        double valorTroco, valorCaneta;

        System.out.println("Escreva a quantidade de canetas compradas:");
        qtdCanetas = dadosScanner.nextInt();
        System.out.println("Escreva o valor da nota usada para pagamento:");
        valorNota = dadosScanner.nextInt();
        System.out.println("Escreva o valor do troco:");
        valorTroco = dadosScanner.nextInt();

        valorCaneta = (valorNota - valorTroco) / qtdCanetas;

        System.out.printf("O valor de cada caneta foi R$" + arredondar(valorCaneta));
        
        dadosScanner.close();
    }

        private static double arredondar(double valor) {
        DecimalFormat formato = new DecimalFormat("0.00");
        double numeroArredondado = Double.parseDouble(formato.format(valor));

        return numeroArredondado;
    }
}

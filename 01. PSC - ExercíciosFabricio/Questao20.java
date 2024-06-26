import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);
        double percentIpi, valorUnidadePecaUm, valorUnidadePecaDois;
        double valorIpiUm, valorIpiDois, valorResultadoUm, valorResultadoDois;
        int codPecaUm, qtdPecasUm, codPecaDois, qtdPecasDois;

        System.out.print("Digite a porcentagem do IPI: ");
        percentIpi = dadosScanner.nextDouble();

        System.out.print("Digite o código da primeira peça: ");
        codPecaUm = dadosScanner.nextInt();

        System.out.print("Digite o valor da primeira peça: ");
        valorUnidadePecaUm = dadosScanner.nextDouble();

        System.out.print("Digite a quantidade comprada da primeira peça: ");
        qtdPecasUm = dadosScanner.nextInt();

        valorIpiUm = (percentIpi / 100) * valorUnidadePecaUm;
        valorResultadoUm = (valorUnidadePecaUm + valorIpiUm) * qtdPecasUm;

        System.out.print("Digite o código da segunda peça: ");
        codPecaDois = dadosScanner.nextInt();

        System.out.print("Digite o valor da segunda peça: ");
        valorUnidadePecaDois = dadosScanner.nextDouble();

        System.out.print("Digite a quantidade comprada da segunda peça: ");
        qtdPecasDois = dadosScanner.nextInt();

        valorIpiDois = (percentIpi / 100) * valorUnidadePecaDois;
        valorResultadoDois = (valorUnidadePecaDois + valorIpiDois) * qtdPecasDois;

        System.out.println("Cód. da Peça\tValor da Peça\tQtd. Compradas\tValor a pagar");
        System.out.printf("%d\t\t%.2f\t\t%d\t\t\t%.2f\n", codPecaUm, valorUnidadePecaUm, qtdPecasUm, valorResultadoUm);
        System.out.printf("%d\t\t%.2f\t\t%d\t\t\t%.2f\n", codPecaDois, valorUnidadePecaDois, qtdPecasDois, valorResultadoDois);
        
        dadosScanner.close();
    }
}
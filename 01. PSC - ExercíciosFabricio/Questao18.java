import java.util.Scanner;
import java.lang.Math;

public class Questao18 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);
        double tamanhoDegrau, tamanhoDesejado;
        int qtdDegraus;


        System.out.print("Digite a altura de cada degrau (em metros): ");
        tamanhoDegrau = dadosScanner.nextDouble();
        System.out.print("Digite a altura que deseja alcançar (em metros): ");
        tamanhoDesejado = dadosScanner.nextDouble();

        qtdDegraus = (int) Math.ceil(tamanhoDesejado / tamanhoDegrau);

        System.out.print(String.format("Você precisa subir %s degraus para alcançar a altura desejada.", 
        qtdDegraus));
        
        dadosScanner.close();
    }
}
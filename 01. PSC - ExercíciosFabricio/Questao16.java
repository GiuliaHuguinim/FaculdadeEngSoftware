import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);
        System.out.println("Escreva a entrada a distância total (em km) percorrida:");
        double  distanciaKm = Double.parseDouble(dadosScanner.nextLine());
        System.out.println("Escreva a quantidade de combustível (em litros) consumida");
        double quantidadeLitros = Double.parseDouble(dadosScanner.nextLine());

        double consumoMedio = distanciaKm / quantidadeLitros;

        System.out.print(String.format("O consumo médio de combustível é %s litros por km",+
        consumoMedio));
        
        dadosScanner.close();
    }
}
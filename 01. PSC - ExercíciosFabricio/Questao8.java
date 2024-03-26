import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args) {
     Scanner dadoScanner = new Scanner(System.in);
    System.out.println("Vamos converter metros para centimetro");
    System.out.println("Digite o valor em metros: ");
    Double metros= Double.parseDouble(dadoScanner.nextLine());
    Double centimetros = metros * 100; // Conversão de metros para centímetros

    Double resultado= metros * centimetros;

    System.out.println("Sua conversão total foi: " + resultado);

    dadoScanner.close();
    }
}


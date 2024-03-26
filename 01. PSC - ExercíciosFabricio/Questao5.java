import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        double dolar=  4.95;
        Scanner dadoScanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao programa de conversão");
        System.out.println("A taxa de cambio do dolar hoje está 4,95");
        System.out.println("Digite o valor em reais que gostaria de converter para dolar:");
        double valor=Double.parseDouble(dadoScanner.nextLine());

        double resultado = dolar * valor;

        System.out.println("O Total da sua conversão para dolar foi " + resultado);
        dadoScanner.close();
    }
}

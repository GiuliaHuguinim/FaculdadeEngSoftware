import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner divisao = new Scanner(System.in);
        System.out.print("Bem Vindo ao programa de Divisão");
        System.out.print("Digite y:");
        double numeroUm = divisao.nextInt();
        System.out.print("Digite x:");
        double numeroDois = divisao.nextInt();
        double resultado = numeroDois / numeroUm;
        System.out.print("A divisão dos dois números foi:" + resultado);
        divisao.close();
    }
}
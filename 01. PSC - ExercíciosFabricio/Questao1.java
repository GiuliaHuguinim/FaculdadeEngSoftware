import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        int numeroUm = soma.nextInt();
        System.out.print("Digite o segundo número:");
        int numeroDois = soma.nextInt();
        int resultado = numeroDois + numeroUm;
        System.out.print("A soma dos dois números foi:" + resultado);
        soma.close();
    }
}

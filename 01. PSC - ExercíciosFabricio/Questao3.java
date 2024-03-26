import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner bemVindo = new Scanner(System.in);
        String nome;
        System.out.println("Informe seu nome");
        nome = bemVindo.nextLine();
        System.out.println("Seja bem vindo(a)" + nome);
        bemVindo.close();

    }
}

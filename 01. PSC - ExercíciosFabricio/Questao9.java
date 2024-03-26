import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner dadoScanner = new Scanner(System.in);
        System.out.println("Vamos calcular a área de um círculo");
        System.out.println("Digite o valor do raio do círculo");
        int raio= Integer.parseInt(dadoScanner.nextLine());

        double resultado = (Math.PI * raio * raio);

        System.out.println("O raio do círculo é " + resultado);

        dadoScanner.close();
    }
}

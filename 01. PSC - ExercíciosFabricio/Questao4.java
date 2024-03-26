import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner dadoScanner = new Scanner(System.in);
        System.out.println("Bem- Vindo ao cadrastramento dos seus dados!");
        System.out.print("Nome: ");
        String nome= dadoScanner.nextLine();
        System.out.print("Endereço: ");
        String endereco=dadoScanner.nextLine();
        System.out.print("Número de telefone: ");
        String telefone=dadoScanner.nextLine();

        System.out.println(" Seus dados inceridos foram: \n");
        System.out.println("Seu nome "+ nome);
        System.out.println("Seu endereço "+ endereco);
        System.out.println("Seu telefone "+ telefone);

        dadoScanner.close();
    }
}



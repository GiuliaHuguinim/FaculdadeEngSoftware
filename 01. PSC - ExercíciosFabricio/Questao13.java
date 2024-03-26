import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner dadosScanner = new Scanner(System.in);

        System.out.println("Escreva o valor da hora de trabalho:");
         double valorHora = Double.parseDouble(dadosScanner.nextLine());

        System.out.println("Escreva o número de horas trabalhadas no mês:");
         double horasMes = Double.parseDouble(dadosScanner.nextLine());

        System.out.println("Escreva o percentual de desconto do INSS");
        double  porcentagemInss = Double.parseDouble(dadosScanner.nextLine());

         double salarioBruto = valorHora * horasMes;
         double  desconto = (porcentagemInss / 100) * salarioBruto;
         double  salarioLiquido = salarioBruto - desconto;

        System.out.print(String.format("Salário bruto: R$%s\nDesconto do INSS: R$%s\nSalário líquido: R$%s",
        salarioBruto, desconto, salarioLiquido));
        
        dadosScanner.close();
    }
}
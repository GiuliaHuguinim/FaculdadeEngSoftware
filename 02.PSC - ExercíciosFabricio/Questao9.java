/*Crie um programa para calcular o IMC de uma pessoa. Ele deve receber o peso atual em quilogramas e a altura, 
em centímetros, e exibir o peso ideal e o peso ideal ajustado. 
Dica: https://eurofarma.com.br/calculadoras/calculadora-de-peso-ideal 
Utilize este como referência para seus testes. Obs. O IMC é apenas uma referência,
 um médico deve ser consultado para entender as necessidades de cada indivíduo.
 */

 import java.util.Scanner;

    public class Questao9 {

    public static void main(String[] args) {
        Scanner dadosScanner= new Scanner(System.in);

        double peso, altura, imc, pesoIdeal, pesoAjustado;
        String genero;

        System.out.print("Qual seu gênero? (M = Masculino e F = Feminino): ");
        genero = dadosScanner.nextLine();
        
        System.out.print("Digite seu peso atual em quilogramas: ");
        peso = dadosScanner.nextDouble();
        
        System.out.print("Digite sua altura em centímetros: ");
        altura = dadosScanner.nextDouble();
        
        imc = calcularIMC(peso, altura);
        System.out.println("Seu IMC é: " + String.format("%.1f", imc));
        
        pesoIdeal = calcularPesoIdeal(altura, genero);
        System.out.println("Seu peso ideal é: " + String.format("%.1f", pesoIdeal) + " kg");
        
        pesoAjustado = calcularPesoIdealAjustado(peso, pesoIdeal);
        System.out.println("Seu peso ideal ajustado é: " + String.format("%.1f", pesoAjustado) + " kg");
        
        dadosScanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        double alturaMetros = altura / 100;
        return peso / (alturaMetros * alturaMetros);
    }
    
    public static double calcularPesoIdeal(double altura, String genero) {
        if(genero.equals("M")) {
            return 52 + (0.75 * (altura - 152.4));
        }

        return 52 + (0.67 * (altura - 152.4));
    }
    
    public static double calcularPesoIdealAjustado(double peso, double pesoIdeal) {
        return ((peso - pesoIdeal) * 0.25) + pesoIdeal;
    }
}

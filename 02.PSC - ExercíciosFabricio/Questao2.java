/*Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina? Especialistas indicam
 que o consumo do carro aumenta em torno de trinta por cento, quando abastecido com etanol, 
 logo, só vale a pena abastecer com ele se o valor estiver abaixo de setenta por cento do valor da gasolina.
  Para auxiliar motoristas a realizar este cálculo, crie um algoritmo que receba o preço dos dois combustíveis, 
  e informe qual deve ser a escolha, com base no custo.
 */
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
    Scanner dadosScanner = new Scanner(System.in);
    double etanol, gasolina;
    boolean resultado;

    System.out.println("Seja bem vindo ao App baixo custo para o seu carro");

    System.out.println("Digite o valor da gasolina do dia:");
    gasolina= dadosScanner.nextInt();

    System.out.println("Digite o valor do etanol do dia:");
    etanol=dadosScanner.nextInt();

    resultado = (gasolina - ( gasolina * 0.70)) > etanol;
    
     if (resultado) {
            System.out.println("Você deve abastecer com etanol");
        } else{
            System.out.println("Você deve abastecer com gasolina");
        }
        dadosScanner.close();
    }
}


   
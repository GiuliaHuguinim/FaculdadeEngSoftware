import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        Scanner dadoScanner = new Scanner(System.in);

        while (true) {

            System.out.println("Vamos calcular a média das temperaturas de hoje!");
            System.out.println(" Digite a 1 temperatura de hoje (entre 4° e 10°c): ");
            int um = dadoScanner.nextInt();
            System.out.println(" Digite a 2 temperatura de hoje (entre 4° e 10°c): ");
            int dois = dadoScanner.nextInt();
            System.out.println(" Digite a 3 temperatura de hoje (entre 4° e 10°c): ");
            int tres = dadoScanner.nextInt();
            System.out.println(" Digite a 4 temperatura de hoje (entre 4° e 10°c): ");
            int quatro = dadoScanner.nextInt();
            System.out.println(" Digite a 5 temperatura de hoje (entre 4° e 10°c): ");
            int cinco = dadoScanner.nextInt();
            System.out.println(" Digite a 6 temperatura de hoje (entre 4° e 10°c): ");
            int seis = dadoScanner.nextInt();
            System.out.println(" Digite a 7 temperatura de hoje (entre 4° e 10°c): ");
            int sete = dadoScanner.nextInt();
            System.out.println(" Digite a 8 temperatura de hoje (entre 4° e 10°c): ");
            int oito = dadoScanner.nextInt();
            System.out.println(" Digite a 9 temperatura de hoje (entre 4° e 10°c): ");
            int nove = dadoScanner.nextInt();
            System.out.println(" Digite a 10 temperatura de hoje (entre 4° e 10°c): ");
            int dez = dadoScanner.nextInt();
            System.out.println(" Digite a 11 temperatura de hoje (entre 4° e 10°c): ");
            int onze = dadoScanner.nextInt();
            System.out.println(" Digite a 12 temperatura de hoje (entre 4° e 10°c): ");
            int doze = dadoScanner.nextInt();

            if (um < 4 || um > 10 || dois < 4 || dois > 10 || tres < 4 || tres > 10 || quatro < 4 || quatro > 10
                    || cinco < 4 || cinco > 10 || seis < 4 || seis > 10 || sete < 4 || sete > 10 || oito < 4 || oito > 10
                    || nove < 4 || nove > 10 || dez < 4 || dez > 10 || onze < 4 || onze > 10 || doze < 4 || doze > 10) {

                System.out.println(" ERRO RESPEITE O LIMITE DE 4° A 10°C");

            } else {
                int media = (um + dois + tres + quatro + cinco + seis + sete + oito + nove + dez + onze + doze) / 12;
                System.out.println("A média das temperaturas de hoje foram: " + media);
                break;
            }
        }

        dadoScanner.close();
    }
}

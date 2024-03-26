/*Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00) */
import java.util.Scanner;
import java.util.Calendar;

public class Questao1 {
    public static void main(String[] args) {
    Scanner dadoScanner = new Scanner(System.in);
    
    Calendar.getInstance();
    Calendar calendar = Calendar.getInstance();
    int hora = calendar.get(Calendar.HOUR_OF_DAY);
    int minutos = calendar.get(Calendar.MINUTE);
    calendar.get(Calendar.SECOND);

    int resultadoMinutos= ((hora*60) + minutos);
    System.out.println("Já se passaram "+ resultadoMinutos+ " minutos total");

    dadoScanner.close();
    }
}





    